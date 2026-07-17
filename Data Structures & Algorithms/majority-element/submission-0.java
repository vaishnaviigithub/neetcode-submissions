class Solution {
    public int majorityElement(int[] nums) {

        int res = 0; 
        int n = nums.length;
        int limit = n/2;

        for(int i=31;i>=0;i--) {
            int cnt = 0;

            for(int j=0;j<n;j++) {
                if (((nums[j]>>i)&1)==1) {
                    cnt++;
                }
            }

            if(cnt>limit) {
                res = res|(1<<i);
            }

        }

        return res;
        
    }
}