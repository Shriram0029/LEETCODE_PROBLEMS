class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pnums1 = m - 1;
        int pnums2 = n - 1;
        int i = m + n - 1;

        while(pnums1 >= 0 && pnums2 >= 0){
            if(nums1[pnums1] > nums2[pnums2]){
                nums1[i] = nums1[pnums1];
                pnums1--;
            }
            else{
                nums1[i] = nums2[pnums2];
                pnums2--;
            }
            i--;
        }
        while(pnums1 >= 0){
            nums1[i] = nums1[pnums1];
            pnums1--;
            i--;
        }
        while(pnums2 >= 0){
            nums1[i] = nums2[pnums2];
            pnums2--;
            i--;
        }
    }
}