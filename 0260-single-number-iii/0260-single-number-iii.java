class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        int LSB = xor & (-xor);

        int xor_0 = 0;
        int xor_1 = 0;
        for(int i : nums){
            if((i & LSB) == 0)
                xor_0 ^= i;
            else
                xor_1 ^= i;
        }
        return new int[]{xor_0,xor_1};
    }
}