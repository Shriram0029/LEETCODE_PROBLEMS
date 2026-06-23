class Solution {
    public int singleNumber(int[] nums) {
        int[] bits = new int[32];
        for(int temp : nums){
            for(int i=0;i<32;i++){
                if(((temp >> i) & 1) == 1){
                    bits[i]++;
                }
            }
        }

        int result = 0;
        for(int i=0;i<32;i++){
            if(bits[i]%3!=0){
                result = result | (1 << i);
            }
        }
        return result;
    }
}