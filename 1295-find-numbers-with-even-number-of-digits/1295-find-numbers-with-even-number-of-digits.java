class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if (even(i)){
                count++;
            }
        }
        return count;
    }
    public boolean even(int i){
        int evencount = 0;
        while(i > 0){
            evencount++;
            i/=10;
        }
        if (evencount % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}