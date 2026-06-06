class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>(); //store index
       

        int r = 0; // result index


        for(int i=0;i<n;i++){

             //remove out of window ele
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i>=k-1){
                result[r++]=nums[dq.peekFirst()];

            }

        }
        return result;
        
    }
}
