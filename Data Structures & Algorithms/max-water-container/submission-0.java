class Solution {
    public int maxArea(int[] nums) {
        int left = 0, right = nums.length-1;
        int maxWater = 0;

        while(left < right) {
            int water = 0;
            if(nums[left] < nums[right]) {

                 water = nums[left] * (right-left);
                left++;

            }
            else {

                 water = nums[right] * (right-left);
                right--;

            }

            maxWater = Math.max(maxWater, water);

        }

        return maxWater;
    }
}
