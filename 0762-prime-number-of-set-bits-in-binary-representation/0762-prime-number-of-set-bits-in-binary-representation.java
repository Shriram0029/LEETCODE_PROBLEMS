class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i=left;i<right+1;i++){
            int temp = i;
            int count = 0; 
            while(temp != 0){
                temp = temp & (temp - 1);
                count++;
            }
            if (count > 1){
                boolean isprime = true;
                for(int j=2;j*j<=count;j++){
                    if(count % j == 0){
                        isprime = false;
                    }
                }
                if(isprime) res++;
            }
        }
        return res;
    }
}