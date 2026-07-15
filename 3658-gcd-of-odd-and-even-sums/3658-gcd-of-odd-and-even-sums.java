class Solution {
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int k = 2*n;
        int oddsum = 0;
        int evensum = 0;

        while(k > 0){
            if((k & 1) == 0){
                evensum += k;
            }
            else{
                oddsum += k;
            }
            k--;
        }
        int result = gcd(oddsum, evensum);
        return result;
    }
}