class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long left = 1;
        long right = (long) Math.min(a,Math.min(b,c)) * n;
        long ab = lcm(a,b);
        long ac = lcm(a,c);
        long bc = lcm(b,c);
        long abc = lcm(ab,c);

        while(left < right){
            long mid = left + (right - left)/2;
            long count = mid/a + mid/b + mid/c - mid/ab - mid/ac - mid/bc + mid/abc;

            if(count < n){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return (int) left;
    }
    public static long gcd(long x, long y){
        while(y != 0){  
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
    public static long lcm(long x, long y){
        return (x * y) / gcd(x,y);
    }
}