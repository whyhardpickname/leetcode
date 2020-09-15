class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mi = (lo + hi) / 2;
        while (lo <= hi)
        {
            mi = (lo + hi) / 2;
            if (nums[mi] > target)
            {
                hi = mi - 1;
            }
            else if (nums[mi] < target)
            {
                lo = mi + 1;
            }
            else
            {
                return mi;
            }
        }
        return lo;
    }
}
