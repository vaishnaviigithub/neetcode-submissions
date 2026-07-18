class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for(String s: strs) {
            res.append(s.length()+"/"+s);
        }

        return res.toString();

    }

    public List<String> decode(String str) {

        int i=0;
        int n = str.length();

        List<String> res = new ArrayList<>();

        while(i<n) {
            int del = str.indexOf('/',i);
            int len = Integer.parseInt(str.substring(i,del));

            res.add(str.substring(del+1,del+1+len));

            i = del+1+len;

        }

        return res;

    }
}
