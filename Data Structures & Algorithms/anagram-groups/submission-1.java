class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> l = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs) {
            int[] cnt = new int[26];
            for(char c: str.toCharArray()) {
                cnt[c-'a']++;
            }
            StringBuilder s = new StringBuilder();
            for(int i: cnt) {
                s.append(i).append(',');
            }
            String key = s.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        for(List<String> s: map.values()) {
            l.add(s);
        }

        return l;
        
    }
}
