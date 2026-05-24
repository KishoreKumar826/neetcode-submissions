class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest=0;

        for(int num:nums){
            
 int current=num;//start sequence
            if(!(set.contains(current-1))){
               
                int length=1;

                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest=Math.max(longest,length);


            }

        }
        return longest;
        
    }
}
