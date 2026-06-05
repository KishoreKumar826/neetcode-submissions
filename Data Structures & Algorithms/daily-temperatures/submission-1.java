class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[temperatures.length];

        for(int i=temperatures.length-1;i>=0;i--){
            int num=temperatures[i];
            
           
                while(!stack.isEmpty() && num>=temperatures[stack.peek()]){
                    stack.pop();
                }
                result[i]=stack.isEmpty()?0: stack.peek()-i;
                stack.push(i);
            
            

            

        }
        return result;
        
    }
}
