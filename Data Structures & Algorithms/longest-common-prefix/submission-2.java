class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str = strs[0];
        int res = str.length();

        for(String s: strs) {
            int len = s.length();
            for (int i=0;i<res;i++) {
                if(i==len) {
                    res = i;
                    break;
                }
                if(s.charAt(i)!=str.charAt(i)) {
                    res = i;
                }
            }
        }
        
        return str.substring(0,res); 
        
    }
}