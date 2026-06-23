class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        for(int i=0;i<32;i++){
            int ai = (a>>i) & 1;
            int bi = (b>>i) & 1;
            int ci = (c>>i) & 1;

            if(ci == 1){
                if((ai | bi) == 0)
                    flips += 1;
            }

            else
                flips += ai + bi;
        }
        return flips;
    }
}