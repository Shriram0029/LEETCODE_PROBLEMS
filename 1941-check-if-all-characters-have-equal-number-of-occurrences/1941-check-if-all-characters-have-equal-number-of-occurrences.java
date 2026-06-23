class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c : ch){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == 1 ? true : false;
    }
}