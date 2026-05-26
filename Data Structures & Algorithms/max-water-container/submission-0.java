class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int width=Math.abs(i-j);
            int height=Math.min(heights[i],heights[j]);
            max=Math.max(max,width*height);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }



        }
        return max;

        
    }
}
