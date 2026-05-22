class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(map.containsKey(target-num)){
                int value=map.get(target-num);
                return new int[]{value,i};
               


            }
            else{
                map.put(num,i);
            }
        }
        return new int[]{0,0};
       
        
       

    }
}
