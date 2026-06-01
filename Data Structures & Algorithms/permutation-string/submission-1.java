class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1_length=s1.length();
        int s2_length=s2.length();
        if(s1_length>s2_length){
            return false;
        }
        int left=0;
        int[] freq_A=new int[26];
        int[] freq_B=new int[26];
        for(int i=0;i<s1_length;i++){
            char ch=s1.charAt(i);
            freq_A[ch-'a']++;
        }
        //first window
        for(int j=0;j<s1_length;j++){
             char ch=s2.charAt(j);
            freq_B[ch-'a']++; 

        }
        if(Arrays.equals(freq_A,freq_B)){
            return true;
        }
       
        
        

        for(int right=s1_length;right<s2_length;right++){
             freq_B[s2.charAt(left)-'a']--;
             freq_B[s2.charAt(right)-'a']++;
             if(Arrays.equals(freq_A,freq_B)){
               return true;
             }
         left=left+1;
        
        }
        return false;
        
        
    }

    
    
}
