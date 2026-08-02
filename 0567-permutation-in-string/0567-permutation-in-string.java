class Solution {
    public boolean match(Map<Character, Integer> map, Map<Character, Integer> maps1){
        if(map.size() != maps1.size()) return false;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();

            if (!maps1.containsKey(key) || !maps1.get(key).equals(val)) {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m) return false;
        HashMap<Character, Integer> maps1 = new HashMap<>();
        for(int k=0;k<n;k++){
            maps1.put(s1.charAt(k), maps1.getOrDefault(s1.charAt(k), 0) + 1);
        }

        for(int i=0;i<m;i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j=i;j<m;j++){
                map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j),0) + 1);
                if(j - i + 1 == n){
                    if(match(map,maps1))
                        return true;
                }
                if(j - i + 1 > n) break;
            }
        }
        return false;
    }
}