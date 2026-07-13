class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int length = temperatures.length-1;
        int[] result = new int[length+1];

        for(int i = length; i >= 0; i--) {
            int currTemp = temperatures[i];

                while(!stack.isEmpty() && stack.peek()[0] <= currTemp) {
                    stack.pop();
                }
                if(!stack.isEmpty()) {
                    result[i] = stack.peek()[1] - i;
                }
                else {
                    result[i] = 0;
                }

                stack.push(new int[]{currTemp,i});
            }
        return result;
    }
}
