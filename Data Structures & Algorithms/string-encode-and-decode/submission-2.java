class Solution {

    public String encode(List<String> strs) {
           StringBuilder sb = new StringBuilder();
           for (String s : strs) {
               sb.append(s.length()).append("#").append(s);
           }
           return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int separator = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, separator));
            i = separator + 1;
            list.add(str.substring(i, i + length));
            i += length;
        }
        return list;
    }
}