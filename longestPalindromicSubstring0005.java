class Solution {
    public String longestPalindrome(String s) {
        int l = 0;
        int r = 0;
        int oddL = 0;
        int evenL = 0;
        int maxL = 0;
        int index = 0;
        boolean isLsuceed = false;
        boolean isRsuceed = false;
        for (int i = 0; i < s.length(); i++)
        {
            l = i;
            r = i;
            oddL = -1;
            evenL = 0;
            isLsuceed = true;
            isRsuceed = true;
            while (l >= 0 && r < s.length())
            {
                if (isLsuceed  && s.charAt(l) == s.charAt(r))
                {
                    oddL += 2;
                    isLsuceed = true;
                }
                else 
                    isLsuceed = false;
                
                if (r + 1 < s.length() && isRsuceed && s.charAt(l) == s.charAt(r + 1))
                {
                    evenL += 2;
                    isRsuceed = true;
                }
                else 
                    isRsuceed = false;
                
                if (!isLsuceed && !isRsuceed)
                    break;
                l--;
                r++;
                
            }
            if (oddL > maxL)
            {
                maxL = oddL;
                index = i;
            }
            if (evenL > maxL)
            {
                maxL = evenL;
                index = i;
            }
        }
        if (maxL == 0)
            return "";
        
        if (maxL % 2 == 0)
            return s.substring(index - maxL / 2 + 1, index + maxL / 2 + 1);
        else 
            return s.substring(index - (maxL - 1) / 2, index + (maxL - 1) / 2 + 1);
    }
}
