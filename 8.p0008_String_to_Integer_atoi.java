class Solution {
    public int myAtoi(String str) {
        /*  char    ASCIICode
            0~9     48~57
        */
        int[] digits = new int[str.length() + 1];
        int indexOfFirstNonSpace = 0;
        
        if (str.isEmpty())
        {
            return 0;
        }
        
        int j = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' ')
            {
                if (str.charAt(i) == '-')
                {
                    digits[j++] = -1;
                    indexOfFirstNonSpace = i + 1;
                }
                else if (str.charAt(i) == '+')
                {
                    digits[j++] = 1;
                    indexOfFirstNonSpace = i + 1;
                }
                else if (str.codePointAt(i) >= 48 && str.codePointAt(i) <= 57)
                {
                    digits[j++] = 1;
                    indexOfFirstNonSpace = i;
                }
                else
                    return 0;
            
                break;
            }
        }
        
        for (int i = indexOfFirstNonSpace; i < str.length(); i++)
        {
                if (str.codePointAt(i) >= 48 && str.codePointAt(i) <= 57)
                {
                    digits[j++] = str.codePointAt(i) - 48;
                }
                else
                    break;
        }
        
       
        long num = 0;
        for (int i = 1; i < j; i++)
        {
            if(i != j - 1)
                num = (num + digits[i]) * 10;
            else
                num = num + digits[i];
            
            if (num * digits[0] > 2147483647)
                return 2147483647;
        
            if (num *digits[0] < -2147483648)
                return -2147483648;
        }
        
        num *= digits[0];
        return (int) num;
    }
}
