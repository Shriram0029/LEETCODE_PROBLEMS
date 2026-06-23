class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;

        int index_2 = 0, index_3 = 0, index_5 = 0;
        for(int i=1;i<n;i++){
            int mul_2 = ugly[index_2] * 2;
            int mul_3 = ugly[index_3] * 3;
            int mul_5 = ugly[index_5] * 5;

            int uglynum = Math.min(mul_2, Math.min(mul_3,mul_5));
            ugly[i] = uglynum;

            if(uglynum == mul_2) index_2++;
            if(uglynum == mul_3) index_3++;
            if(uglynum == mul_5) index_5++;
        }
        return ugly[n-1];
    }
}