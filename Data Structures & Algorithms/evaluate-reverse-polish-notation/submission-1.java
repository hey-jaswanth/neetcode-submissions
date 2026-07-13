class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {

            if("+-*/".contains(token)) {
                int res = 0;
                switch(token) {

                    case "+": {
                        int firstOp = stack.pop();
                        int secOp = stack.pop();
                        res = secOp + firstOp;
                        break;
                    }
                    case "-": {
                        int firstOp = stack.pop();
                        int secOp = stack.pop();
                        res = secOp - firstOp;
                        break;
                    }
                    case "*": {
                        int firstOp = stack.pop();
                        int secOp = stack.pop();
                       res = secOp * firstOp;
                        break;
                    }
                    case "/": {
                        int firstOp = stack.pop();
                        int secOp = stack.pop();
                        res = secOp / firstOp;
                    }


                }
                stack.push(res);

            }
            else {
                stack.push(Integer.parseInt(token));
            }

        }

        return stack.pop();
    }
}
