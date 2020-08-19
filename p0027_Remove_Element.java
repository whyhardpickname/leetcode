class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        while(i < j)
        {
            if (nums[i] == val)
            {
                while(nums[j] == val && j > 0)
                {
                    j--;
                }
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            i++;
        }
        if (nums.length == 1 && nums[i] != val)
        {
            return i + 1;
        }
        return i;
    }
}
