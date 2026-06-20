class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <=1) return s.length();
        Map<Character, Integer> map = new HashMap<>();

        int start = 0, end = 0;
        int maxLength = 1;

        while(end < s.length()){
            char endChar = s.charAt(end);

            if(map.containsKey(endChar)) {

                if(start < map.get(endChar) + 1) {
                start = map.get(endChar) + 1;
                }

            }
            map.put(endChar, end);
            maxLength = Math.max(end - start + 1, maxLength);
            end++;
        }

        return maxLength;

    }
}
