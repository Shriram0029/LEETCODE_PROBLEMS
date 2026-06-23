class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();

        if (s2.length() < k) return false;

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sorteds1 = new String(s1Arr);

        for (int i = 0; i <= s2.length() - k; i++) {

            String sub = s2.substring(i, i + k);
            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);

            String sortedsub = new String(subArr);

            if (sortedsub.equals(sorteds1)) {
                return true;
            }
        }

        return false;
    }
}