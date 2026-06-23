class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        ArrayList<Map.Entry<Character, Integer>> l = new ArrayList<>(map.entrySet());
        
        for (int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++){
                if(l.get(j).getValue() > l.get(i).getValue()){
                    Map.Entry<Character, Integer> e = l.get(i);
                    l.set(i, l.get(j));
                    l.set(j, e);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> temp : l){
            char ch = temp.getKey();
            int f = temp.getValue();

            for(int i=0;i<f;i++){
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}