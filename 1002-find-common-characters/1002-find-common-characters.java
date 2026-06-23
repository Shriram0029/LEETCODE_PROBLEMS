class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<words[0].length();i++){
            char c = words[0].charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(int i=1;i<words.length;i++){
            HashMap<Character, Integer> current = new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                char c = words[i].charAt(j);
                current.put(c, current.getOrDefault(c,0) + 1);
            }

            for(char key : map.keySet()){
                int minfreq = Math.min(map.get(key), current.getOrDefault(key,0));
                map.put(key, minfreq);
            }
        }

        List<String> result = new ArrayList<>();

        for (char c : map.keySet()) {
            int freq = map.get(c);
            for (int i = 0; i < freq; i++) {
                result.add(String.valueOf(c));
            }
        }

        return result;

    }
}