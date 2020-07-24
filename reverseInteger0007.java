class Solution {
    public int reverse(int x) {
        int sign = 1;
        int absX = x;
        if(x < 0)
        {
            absX = -1 * x;
            sign = -1;
        }
        
        int y = x;
        int length = 0;
        if (x == 0)
            length  = 1;
        while (y != 0)
        {
            y /= 10;
            length++;
        }
            
        int[] digits = new int[length];
        for (int i = 0; i < length; i++)
        {
            digits[i] = absX%10;
            absX /= 10;
        }
        
        long reverseX = 0;
        for (int i = 0; i <  length; i++)
        {
            if (i != length - 1)
                reverseX = (reverseX + digits[i]) * 10;
            else
                reverseX = (reverseX + digits[i]);
            
            if (reverseX < -2147483648 || reverseX > 2147483647)
                return 0;
        }
        return (int) (reverseX * sign);
    }
}
