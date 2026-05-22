class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result=new ArrayList<>();
        for(int i=0;i<strs.length-1;i++){
            List<String> subList=new ArrayList<>();
            if(strs[i] != null){
            subList.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                 if(strs[j] != null && isAnagram(strs[i],strs[j])){
                    subList.add(strs[j]);
                    strs[j]=null;
                 }
            }
            result.add(subList);
            }
            
        }
        if(strs[strs.length-1] != null){
            List<String> subList=new ArrayList<>();
            subList.add(strs[strs.length-1]);
            result.add(subList);
        }
        return result;
        
    }

     public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] s_charcount=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            s_charcount[ch-'a']=++s_charcount[ch-'a'];
        }
        int[] t_charcount=new int[26];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            t_charcount[ch-'a']=++t_charcount[ch-'a'];
        }
        for(int i=0;i<s_charcount.length;i++){
            if(s_charcount[i]!=t_charcount[i]){
                return false;
            }
        }
        return true;
    }
}