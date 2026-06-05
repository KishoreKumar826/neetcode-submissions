class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                if(str.equals("+")){
                    stack.push(a+b);
                }
                else if(str.equals("-")){
                    stack.push(b-a);
                }
                else if(str.equals("*")){
                    stack.push(a*b);
                }
               else if(str.equals("/")){
                    stack.push(b/a);
                }

            }
            else{
                int num=Integer.parseInt(str);
                stack.push(num);

            }
        }
        return stack.peek();
        
    }
}
