class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> result=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(map.containsKey(key)){
                int value=map.get(key);
                value=value+1;
                map.put(key,value);

            }
            else{
                map.put(key,1);
                
            }
        }
        
         return map.entrySet()
                  .stream()
                  .sorted((e1, e2) ->
                      e2.getValue() - e1.getValue()
                  )
                  .limit(k)
                  .mapToInt(Map.Entry::getKey)
                  .toArray();

        
    }
}
