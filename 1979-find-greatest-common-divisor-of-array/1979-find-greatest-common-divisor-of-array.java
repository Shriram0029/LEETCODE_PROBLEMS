class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0];
        int y = nums[nums.length - 1];
        if(x==y)
            return x;
        while(y!=0){
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}