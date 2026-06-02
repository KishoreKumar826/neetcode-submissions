class Solution {
    public String minWindow(String s, String t) {
        int s_length=s.length();
        int t_length=t.length();
        int left=0;
        int min=Integer.MAX_VALUE;
        String result="";

      for(int i = 0; i < s.length(); i++) {
        for(int j = i; j < s.length(); j++) {
        String sub = s.substring(i, j + 1);

        if(isValid(sub, t)) {
            int length=j-i+1;
            if(length<min){
                min=length;
                result=s.substring(i,j+1);
            }
            // update minimum length answer
        }
    }
}
return result;
        
    }

   public boolean isValid(String sub, String t) {

    int[] freqSub = new int[128];
    int[] freqT = new int[128];

    for(int i = 0; i < sub.length(); i++) {
        freqSub[sub.charAt(i)]++;
    }

    for(int i = 0; i < t.length(); i++) {
        freqT[t.charAt(i)]++;
    }

    for(int i = 0; i < 128; i++) {
        if(freqSub[i] < freqT[i]) {
            return false;
        }
    }

    return true;
}
}
