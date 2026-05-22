class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] s_charcount=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            s_charcount[ch-97]=++s_charcount[ch-97];
        }
        int[] t_charcount=new int[26];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            t_charcount[ch-97]=++t_charcount[ch-97];
        }
        for(int i=0;i<s_charcount.length;i++){
            if(s_charcount[i]!=t_charcount[i]){
                return false;
            }
        }
        return true;

    }
}
