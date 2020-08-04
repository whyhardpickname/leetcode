class Solution
{
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int closestDistance = Math.max(Math.abs(nums[0] - target), Math.abs(nums[nums.length - 1] - target)) * 3 + 1;
        int closestSum = 0;
        int k = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                k = Arrays.binarySearch(nums, j + 1, nums.length, target - nums[i] - nums[j]); 
                if (k > j)
                {
                    return target;
                }
            
                if (-k - 1 < nums.length && Math.abs(target - nums[i] - nums[j] - nums[-k -1]) < closestDistance)
                {
                    closestDistance = Math.abs(target - nums[i] - nums[j] - nums[-k -1]);
                    closestSum = nums[i] + nums[j] + nums[-k - 1];
                }
                
                if (-k - 2 > j && Math.abs(target - nums[i] - nums[j] - nums[-k - 2]) < closestDistance)
                {
                    closestDistance = Math.abs(target - nums[i] - nums[j] - nums[-k -2]);
                    closestSum = nums[i] + nums[j] + nums[-k - 2];
                }
            }
        }
        return closestSum;
    }
}
