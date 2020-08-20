class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int i = 0;
        int j = nums.length - 1;
        int tmp = 0;
        while(i <= j)
        {
            while (i < nums.length && nums[i] != val)
            {
                i++;
            }
            while (j >= 0 && nums[j] == val)
            {
                j--;
            }
            if (i < j)
            {
                tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
            else
            {
                break;
            }
        }
        return i;
    }
}
