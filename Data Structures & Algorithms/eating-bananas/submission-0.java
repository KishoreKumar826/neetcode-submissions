class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int start=1;
        int end=max;
        int result=1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(checkSpeed(piles,mid,h)<=h){
                end=mid-1;
                result=mid;
            }
            else{
                start=mid+1;

            }
        }
        return result;
        
    }

    public int checkSpeed(int[] piles, int k, int h){
        int totalHours=0;
        for(int i=0;i<piles.length;i++){
            totalHours+= (piles[i] + k - 1)/k;

        }
        return totalHours;

    }

}
