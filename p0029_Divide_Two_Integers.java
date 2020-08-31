class Solution {
    public int divide(int dividend, int divisor) {
        int signOfDividend = 1;
        int signOfDivisor = 1;
        int quotient = 0;
        int minusPow2By31 = -2147483648;
        if (dividend == minusPow2By31 && divisor == -1)
        {
            return -minusPow2By31 - 1;
        }
        
        if (dividend < 0)
        {
            signOfDividend = -1;
        }
        if (divisor < 0)
        {
            signOfDivisor = -1;
        }
        if (divisor == minusPow2By31)
        {
            if (dividend == minusPow2By31)
            {
                return 1;
            }
            else 
            {
                return 0;
            }
        }
        int absOfDividend = Math.abs(dividend);
        int absOfDivisor = Math.abs(divisor);
        if (dividend == minusPow2By31)
        {
            absOfDividend = -minusPow2By31 - absOfDivisor;
            quotient++;
        }
        while (absOfDividend -  absOfDivisor>= 0)
        {
            quotient++;
            absOfDividend -= absOfDivisor;
            int power = 1;
            while (absOfDivisor < -(minusPow2By31 / 2) && absOfDividend - (absOfDivisor << 1) >= 0)
            {
                power = power << 1;
                absOfDivisor = absOfDivisor << 1;
                quotient += power;
                absOfDividend -= absOfDivisor;
            }
            absOfDivisor = Math.abs(divisor);
        }
        
        return signOfDividend * signOfDivisor * quotient;
    }
}
