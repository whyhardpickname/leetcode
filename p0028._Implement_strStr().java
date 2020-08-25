class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        if (needle.length() == 0)
        {
            return 0;
        }
        while (haystack.length() >= needle.length() && i <= (haystack.length() - needle.length()))
        {
            if (haystack.substring(i, i + needle.length()).compareTo(needle) == 0)
            {
                return i;
            }
            i++;
        }
        return -1;
    }
}
