class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<strs.length; i++){
            String current = strs[i];
            char[] c = current.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if(map.containsKey(sorted) == false){
                List<String> list = new ArrayList<>();
                list.add(current);
                map.put(sorted, list);
            }

            else{
                List<String> exists = map.get(sorted);
                exists.add(current);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for(List<String> e : map.values()){
            result.add(e);
        }
        return result;
    }
}