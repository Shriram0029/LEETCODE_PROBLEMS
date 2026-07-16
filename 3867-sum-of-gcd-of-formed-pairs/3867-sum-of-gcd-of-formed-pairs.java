class Solution {
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    public long gcdSum(int[] nums) {
        int[] prefixgcd = new int[nums.length];
        int mx = 0;
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            prefixgcd[i] = gcd(nums[i], mx);
        }
        Arrays.sort(prefixgcd);
        int l = 0;
        int r = prefixgcd.length - 1;
        long sum = 0;
        while(l < r){
            int temp = gcd(prefixgcd[l], prefixgcd[r]);
            sum += temp;
            l++;
            r--;
        }
        return sum;
    }
}