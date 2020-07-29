class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs.length == 0)
            return "";
        
        int index = 0;
        int minIndex = strs[0].length();
        
        for (int i = 0; i < strs.length; i++)
        {
            index = 0;
            
            if (strs[i].length() == 0)
                return "";
            
            for (int j = 0; j < strs[i].length(); j++)
            {
                if (j < strs[0].length() && strs[0].charAt(j) == strs[i].charAt(j))
                    index++;
                else
                    break;
            }
            
            if (minIndex > index)
                minIndex = index;
        }
        
        return strs[0].substring(0, minIndex);
    }
}
