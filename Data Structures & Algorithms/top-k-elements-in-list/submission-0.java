class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        List<List<Integer>> cnt_arr = new ArrayList<>();
        for(int i=0;i<=n;i++) {
            cnt_arr.add(new ArrayList<>());
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int x: map.keySet()) {
            cnt_arr.get(map.get(x)).add(x);
        }

        int idx=0;
        int[] res = new int[k];

        for(int i=n;i>=1;i--) {
            for(int x: cnt_arr.get(i)) {
                res[idx++]=x;
                if(idx==k) break;
            }
            if(idx==k) break;
        }

        return res;
        
    }
}
