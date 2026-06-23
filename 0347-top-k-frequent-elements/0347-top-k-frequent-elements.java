class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int[] result = new int[k];
        int picked = 0;
        while(picked < k && !map.isEmpty()){
            int maxkey = 0;
            int maxfreq = -1;
            for(Map.Entry<Integer, Integer> temp : map.entrySet()){
                int key = temp.getKey();
                int freq = temp.getValue();
                if(freq > maxfreq){
                    maxfreq = freq;
                    maxkey = key;
                }
            }
            result[picked] = maxkey;
            picked++;
            map.remove(maxkey);
        }
        return result;
    }
}