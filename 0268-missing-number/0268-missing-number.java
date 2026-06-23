class Solution {
    public int missingNumber(int[] nums) {
        int sum_num = 0;
        for(int i=0;i<nums.length + 1;i++){
            sum_num += i;
        }
        int sum_array = 0;
        for(int i=0;i<nums.length;i++){
            sum_array += nums[i];
        }
        return sum_num - sum_array;
    }
}