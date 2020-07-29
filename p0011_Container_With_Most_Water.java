class Solution {
    public int maxArea(int[] height) {
        int maxV = 0;
        int currentV = 0;
        
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
            {
                currentV = (j - i) * (height[i] < height[j]? height[i] : height[j]);
                
                if (maxV < currentV)
                {
                    maxV = currentV;
                }
            }
        
        return maxV;
    }
}
