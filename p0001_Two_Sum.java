/** 
    解法：枚举所有两个数和的组合，直到找到目标和。
*/
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
