class Solution 
{
    public String countAndSay(int n) 
    {
        String current = "1";
        for (int k = 1; k < n; k++)
        {
            int i = 0; 
            int j = 0;
            String next = "";
            while (j < current.length())
            {
                while (j < current.length() && Character.compare(current.charAt(i), current.charAt(j)) == 0)
                {
                    j++;
                }
                next += (j - i) + current.substring(j - 1, j);
                i = j;
            }
            current = next;
        }
        return current;
    }
}
