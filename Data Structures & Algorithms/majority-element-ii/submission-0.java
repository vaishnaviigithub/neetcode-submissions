class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();
        int freq = nums.length/3;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i: nums) {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==freq+1) {
                res.add(i);
            }
        }

        return res;
        
    }
}