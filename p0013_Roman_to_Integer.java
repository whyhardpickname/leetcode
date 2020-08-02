class Solution {
    public int romanToInt(String s) {
        String symbols ="IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        int[] s2v = new int[s.length()] ;
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < symbols.length(); j++)
            {
                if (s.charAt(i) == symbols.charAt(j))
                {
                    s2v[i] = values[j];
                    break;
                }
            }
        }
        
        for (int i = 0; i < s.length(); i++)
        {
            if (i < s.length() - 1 && s2v[i] < s2v[i + 1])
            {
                sum += (-1 * s2v[i] + s2v[i + 1]);
                i++;
            }
            else
            {
                sum += s2v[i];
            }
        }
        return sum;
    }
}
