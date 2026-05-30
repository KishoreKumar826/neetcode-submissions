class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
      Deque<Character> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            while(dq.contains(ch)){
                dq.removeFirst();
            }
            dq.addLast(ch);
            maxLength=Math.max(maxLength,dq.size());


        }
        return maxLength;
        
    }
}
