class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int total = 0;
        for(String word : words){
            HashMap<Character, Integer> freq = new HashMap<>(map);
            boolean valid = true;

            for(char c : word.toCharArray()){
                if(!freq.containsKey(c) || freq.get(c) == 0){
                    valid = false;
                    break;
                }
                freq.put(c, freq.get(c) - 1);
            }
            if(valid)
                total += word.length();
        }
        return total;
    }
}