class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1_length=s1.length();
        int s2_length=s2.length();
        int left=0;
        //first window
        for(int right=s1_length-1;right<s2_length;right++){
            if(checkSame(s1,s2.substring(left,right+1))){
                return true;
            }
            left++;

        }
        return false;
        
        
    }

    public boolean checkSame(String s1, String s2){

       char[] a = s1.toCharArray();
       char[] b = s2.toCharArray();

Arrays.sort(a);
Arrays.sort(b);

return Arrays.equals(a, b);
    }
}
