class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;
        int j=0;
        while(j < nums.length){
            if(nums[j] == 1){
                count++;
            }
            else{
                max_count = Math.max(max_count,count);
                count = 0;
            }
            j++;
        }
        return Math.max(max_count,count);
    }
}