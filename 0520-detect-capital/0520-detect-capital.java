class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;
        char[] ch = word.toCharArray();
        for(char i : ch){
            if(Character.isUpperCase(i)) uppercase += 1;
        }
        return uppercase == word.length() || uppercase == 0 || (uppercase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}