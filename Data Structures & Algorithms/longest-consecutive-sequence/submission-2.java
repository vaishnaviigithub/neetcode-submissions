class Solution {
    public int longestConsecutive(int[] nums) {

        int res = 0;
        Set<Integer> set = new HashSet<>();

        for(int i: nums) {
            set.add(i);
        }

        for(int i: set) {

            if (!set.contains(i-1)) {
                int cur = 0;
                int temp = i;
                while(set.contains(temp)) {
                    cur++;
                    temp++;
                }
                res = Math.max(res,cur);
            }

        }

        return res;
        
    }
}
