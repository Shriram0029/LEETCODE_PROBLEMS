class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int pro = 1;
        int count = 0;
        int l = 0;
        for(int r=0;r<nums.length;r++){
            pro*=nums[r];
            while(pro >= k){
                pro /= nums[l];
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}