class Solution {
    public int reverse(int x) {
        int newnum = 0;
        int numcopy = x;
        int sign = (x < 0) ? -1 : 1;
        
        x = Math.abs(x);
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if (newnum > Integer.MAX_VALUE / 10 || 
                (newnum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (newnum < Integer.MIN_VALUE / 10 || 
                (newnum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            newnum = newnum * 10 + digit;
        }
        
        return newnum * sign;
    }
}