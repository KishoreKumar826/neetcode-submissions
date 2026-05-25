class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
       
        StringBuilder sb=new StringBuilder();
        for(int x=0;x<n;x++){
            char ch=s.charAt(x);
            if((ch>=65 &&ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)){
                sb.append(Character.toLowerCase(ch));
            }

        }
        String str=sb.toString();
         int i=0;
        int j=str.length()-1;
        while(i<j){
            if(!(str.charAt(i)==str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}