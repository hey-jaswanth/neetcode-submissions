class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        int length = 0;

        for(int num : nums) set.add(num);

        for(int num : nums) {
            length = 1;
            if(set.contains(num-1)) continue;
            
            while(set.contains(num + 1)) {
                length++;
                num++;
            }

            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
