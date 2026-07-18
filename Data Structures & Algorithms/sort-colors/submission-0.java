class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int p1 = 0, p2=0, p3 = n-1;

        while(p2<=p3) {
            if(nums[p2]==1) {
                p2++;
            }
            else if(nums[p2]==0) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2++;
            }
            else {
                int temp = nums[p2];
                nums[p2] = nums[p3];
                nums[p3] = temp;
                p3--;
            }
        }
        
    }
}