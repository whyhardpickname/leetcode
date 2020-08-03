class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> comb = new ArrayList<String>();
        String[] numLetter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int[] base = new int[digits.length()];
        int[] phoneNum = new int[digits.length()];
        int[] num = new int[digits.length()];
        
        for (int i = 0; i < digits.length(); i++)
        {
            num[i] = 0;
        }
        
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
        
        String s = "";
        int carry = 0;
        int temp = 0;
        while(num[0] < base[0])
        {
            for (int i = 0; i < num.length; i++)
            {
                s += numLetter[phoneNum[i]].substring(num[i], num[i] + 1);
            }
            comb.add(s);
            for (int i = num.length - 1; i >= 0; i++)
            {
                temp = carry;
                carry = (num[i] + carry) / base[i];
                num[i] = (num[i] + temp) % base[i];
            }
            
        }
        
        return comb;
    }
}
