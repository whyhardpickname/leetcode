class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        
        int i = 0;
        int j = 0;
        int size = 1;
        while (i < nums.length)
        {
            while (j < nums.length && nums[i] == nums[j])
            {
                j++;
            }
            
            if (j < nums.length)
            {
                nums[++i] = nums[j];
                size++;
            }
            else
            {
                break;
            }
        }
        return size;
    }
}
