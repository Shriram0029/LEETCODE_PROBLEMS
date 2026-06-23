/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = order_agnostic(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return order_agnostic(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // You are in the descending part of the array
                end = mid;
            } else {
                // You are in the ascending part of the array
                start = mid + 1;
            }
        }
        // At the end of the loop, start == end, pointing to the peak element
        return start;
    }

    public int order_agnostic(MountainArray mountainArr, int target, int start, int end) {
        boolean asc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            }
            if (asc) {
                if (target < midValue) {
                    end = mid - 1;
                } else if (target > midValue) {
                    start = mid + 1;
                }
            } else {
                if (target < midValue) {
                    start = mid + 1;
                } else if (target > midValue) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}