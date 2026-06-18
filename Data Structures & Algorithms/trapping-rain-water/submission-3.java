class Solution {
    public int trap(int[] heights) {
        int length = heights.length;

        if(length <= 2) return 0;

        int[] rightMax = new int[length];
        int totalWater = 0;


        rightMax[length-1] = heights[length-1];
        for(int i = length-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        int leftMax = heights[0];
        for(int i = 1; i < length-1; i++) {
            leftMax = Math.max(leftMax, heights[i]);
            totalWater += Math.min(leftMax, rightMax[i]) - heights[i];
            
        }

        return totalWater;


    }
}
