class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if ( sum > max ) {
                max = sum;
            }
        }
        return max;
    }
}