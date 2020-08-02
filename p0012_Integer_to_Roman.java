class Solution {
    public String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D", "CD","C", "XC", 
                            "L", "XL", "X", "IX", "V", "IV", 
                            "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String v2s = "";
        int value = num;
        
        
        while (value != 0)
        {
            for (int i = 0; i < values.length; i++)
            {
                if (value >= values[i])
                {
                    value -= values[i];
                    v2s += symbols[i];
                    break;
                }
            }
        }
        return v2s;    
    }
}
