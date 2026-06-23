class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> arr = new ArrayList<>();

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : nums){
            h.put(i, h.getOrDefault(i,0)+1);
        }
        for(int k : h.keySet()){
            if(h.get(k) > n / 3) arr.add(k);
        }
        return arr;
    }
}