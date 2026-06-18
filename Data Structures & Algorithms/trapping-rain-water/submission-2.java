class Solution {
    public int trap(int[] heights) {
        int length = heights.length;

        if(length <= 2) return 0;

        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        int totalWater = 0;

        leftMax[0] = heights[0];
        for(int i = 1; i < length; i++) {
            // System.out.println(i);
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        rightMax[length-1] = heights[length-1];
        for(int i = length-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        for(int i = 1; i < length-1; i++) {

            totalWater += Math.min(leftMax[i], rightMax[i]) - heights[i];

        }

        return totalWater;


    }
}
