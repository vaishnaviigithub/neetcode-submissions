class Solution {
    public int[] sortArray(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] res = new int[nums.length];

        for(int i: nums) {
            map.put(i,map.getOrDefault(i,0)+1);
            min = Math.min(min,i);
            max = Math.max(max,i);
        }

        int idx=0;

        for(int i=min;i<=max;i++) {
            if(map.containsKey(i)) {
                for(int j=0;j<map.get(i);j++) {
                    res[idx++]=i;
                }
            }
        }        

        return res;
        
    }
}