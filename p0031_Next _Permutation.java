class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
        {
            return;
        }
        int i = nums.length - 1;
        while (i - 1 >= 0 && nums[i - 1] >= nums[i])
        {
             i--;
        }
        if (i - 1 < 0)
        {
            Arrays.sort(nums, i, nums.length);
            return;
        }
        int tmp = nums[i - 1];
        int j = nums.length - 1;
        while (j >= 0 && tmp >= nums[j])
        {
            j--;
        } 
        nums[i - 1] = nums[j];
        nums[j] = tmp;
        Arrays.sort(nums, i, nums.length);
    }
}
