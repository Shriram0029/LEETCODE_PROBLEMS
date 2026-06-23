class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for(int i=0;i<n+1;i++){
            bits[i] = Integer.bitCount(i);
        }
        return bits;

    }
}