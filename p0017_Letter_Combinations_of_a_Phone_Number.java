class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> comb = new ArrayList<String>();
        if (digits.length() == 0)
        {
            return comb;
        }
        String[] numLetter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int[] base = new int[digits.length()];
        int[] phoneNum = new int[digits.length()];
        int[] num = new int[digits.length()];
        
        for (int i = 0; i < digits.length(); i++)
        {
            phoneNum[i] = digits.codePointAt(i) - 48;
            if (phoneNum[i] == 7 || phoneNum[i] == 9)
            {
                base[i] = 4;
            }
            else
            {
                base[i] = 3;
            }
        }
        
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while(carry == 0)
        {
            s = new StringBuilder();
            for (int i = 0; i < num.length; i++)
            {
                s.append(numLetter[phoneNum[i]].substring(num[i], num[i] + 1));
            }
            comb.add(s.toString());
            carry = 1;
            for (int i = num.length - 1; i >= 0; i--)
            {
                num[i] += carry;
                carry = num[i] / base[i];
                num[i] %= base[i];
            }
            
        }
        return comb;
    }
}
