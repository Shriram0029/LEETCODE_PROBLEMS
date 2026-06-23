class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int mid = start + ( end - start ) / 2;
            if (nums[mid] > nums[mid+1]) {
                // you are in decreasing part of array
                // this may be the ans , but look at left
                // so that's why end != mid -1 ;
                end = mid;
            }
            else {
                // ypu are in ascending part of array
                start = mid + 1;
                // becoz mid+1 element is greater than mid element
            }
        }
        // at last, start and end are pointing to the same largest number
        return start;
    }
}