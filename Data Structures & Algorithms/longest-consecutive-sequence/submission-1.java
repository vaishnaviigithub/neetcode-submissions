class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: nums) {
            set.add(i);
            min = Math.min(min, i);
            max = Math.max(max,i);
        }

        int res = 0;
        int cur = 0;

        for(int i=min;i<=max;i++) {
            if(!set.contains(i)) {
                res = Math.max(res,cur);
                cur=0;
            } else {
                cur++;
            }
        }

        res = Math.max(res,cur);

        return res;
        
    }
}
