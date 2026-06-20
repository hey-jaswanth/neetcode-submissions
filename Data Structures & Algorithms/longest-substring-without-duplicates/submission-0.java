class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <=1) return s.length();
        int maxLength = 1;

        for(int i = 0; i < s.length() - 1; i++) {

            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j = i+1; j < s.length(); j++) {
                
                if(set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                

            }
            maxLength = Math.max(set.size(), maxLength);
        }

        return maxLength;
    }
}
