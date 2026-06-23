class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        HashSet<Integer> s = new HashSet<>();
        for(int x : map.values()){
            if(s.contains(x))
                return false;
            s.add(x);
        }
        return true;
    }
}