class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero_count = 0;
        int l = 0;
        for(int r=0;r<nums.length;r++){
            if(nums[r] == 0){
                zero_count++;
            }
            if(zero_count > k){
                if(nums[l] == 0){
                    zero_count--;
                }
                l++;
            }
        }
        return nums.length - l;
    }
}