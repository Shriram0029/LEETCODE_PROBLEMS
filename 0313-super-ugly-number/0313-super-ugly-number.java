class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        int[] ugly = new int[n];
        ugly[0] = 1;

        int[] index = new int[k];
        for(int i=1;i<n;i++){

            long nextugly = (long) ugly[index[0]] * primes[0];
            for(int j=1;j<k;j++){
                long candidate = (long) ugly[index[j]] * primes[j];
                if(candidate < nextugly){
                    nextugly = candidate;
                }
            }

            ugly[i] = (int) nextugly;
            for(int j=0;j<k;j++){
                if(ugly[index[j]] * primes[j] == nextugly){
                    index[j]++;
                }
            }
        }
        return ugly[n-1];
    }
}