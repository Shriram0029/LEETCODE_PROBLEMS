import java.util.Arrays;

class Solution {
    public int numPrimeArrangements(int n) {
        int primecount = primenumbercheck(n);
        int nonprimecount = n - primecount;
        long permutations  = 1;

        for(int i=1;i<=primecount;i++){
            permutations = (permutations * i) % 1000000007;
        }
        for(int i=1;i<=nonprimecount;i++){
            permutations = (permutations * i) % 1000000007;
        }
        return (int) permutations;
    }

    public static int primenumbercheck(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}