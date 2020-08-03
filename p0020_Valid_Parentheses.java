class Solution {
    public boolean isValid(String s) {
        char[] parentheses = new char[s.length()];
        int size = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                parentheses[size++] = s.charAt(i);
            }
            else
            {
                if (size == 0)
                {
                    return false;
                }
                
                if ((s.charAt(i) == ')' && parentheses[size - 1] == '(' )
                   || (s.charAt(i) == '}' && parentheses[size - 1] == '{' )
                   || (s.charAt(i) == ']' && parentheses[size - 1] == '[' ))
                {
                    size--;
                }
                else
                {
                    return false;
                }
            }
        }
        
        if (size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
