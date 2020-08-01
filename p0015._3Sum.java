class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        //排序保证nums[i] <= nums[j]
        Arrays.sort(nums);
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < nums.length; i++)
        {   
            //确保i和j不选同一个数
            for (int j = i + 1; j < nums.length; j++)
            {
                int k = Arrays.binarySearch(nums, j + 1, nums.length, -nums[i] - nums[j]);
                
                if (k >= 0)
                {
                    Integer[] solution = {nums[i], nums[j], nums[k]};
                    List<Integer> list = Arrays.asList(solution);
                    solutions.add(list);
                }
                //重复的数字i只选一次
                while (j < nums.length - 1 && nums[j] == nums[j + 1])
                {
                    j++;
                }
            }
            //重复的数字i只选一次
            while (i < nums.length - 1 && nums[i] == nums[i + 1])
            {
                i++;
            }
        }
        
        return solutions;
    }
}
