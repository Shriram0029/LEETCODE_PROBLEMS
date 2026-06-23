class Solution {
    public int countTriplets(int[] nums) {
        int max = 1 << 16;
        int[] freq = new int[max];
        for(int a : nums){
            for(int b : nums){
                freq[a & b]++;
            }
        }

        int result = 0;
        for(int c : nums){
            for(int x=0;x<max;x++){
                if((x & c) == 0){
                    result += freq[x];
                }
            }
        }
        return result;
    }
}