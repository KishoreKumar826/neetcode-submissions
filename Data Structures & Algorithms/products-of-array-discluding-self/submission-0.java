class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefMultiply=new int[n];
        int[] suffMultiply=new int[n];
        int[] result=new int[n];
        prefMultiply[0]=nums[0];
        for(int i=1;i<n;i++){
            prefMultiply[i]=nums[i]*prefMultiply[i-1];
   
        }
        suffMultiply[n-1]=nums[n-1];
        for(int i=n-2;i>0;i--){
            suffMultiply[i]=nums[i]*suffMultiply[i+1];
        }
        for(int i=0;i<result.length;i++){
            if(i==0){
                result[i]=suffMultiply[i+1];
            }
            else if(i==n-1){
                result[i]=prefMultiply[i-1];
            }
            else{
                result[i]=prefMultiply[i-1]*suffMultiply[i+1];
            }
        }
        return result;




        
    }
}  
