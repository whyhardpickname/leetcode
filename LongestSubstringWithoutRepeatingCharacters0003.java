class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {      
        if (s.length() < 2)
            return s.length();
        
        int start = 0;
        int end = 1;
        int max = end - start;
        boolean isEndIn = false;
        
        while(end < s.length())
        {
            isEndIn = false;
            for (int i = start; i < end; i++)
            {
                if (s.charAt(end) == s.charAt(i))
                {
                    isEndIn = true;
                    start++;
                    break;
                }
            }
            if (!isEndIn)
                end++;
            if (end - start > max)
                max = end -start;
        }
        return max;
    }
}          
