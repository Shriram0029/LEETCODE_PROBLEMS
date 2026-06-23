class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = primenumbercheck(right);
        int prev = -1;
        int mindiff = Integer.MAX_VALUE;
        int[] ans = {-1,-1};
        for(int i=left;i<=right;i++){
            if(isPrime[i]){
                if(prev != -1){
                    int diff = i - prev;
                    if(diff < mindiff){
                        mindiff = diff;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }
    public static boolean[] primenumbercheck(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if(n>=0) isPrime[0] = false;
        if(n>=1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}