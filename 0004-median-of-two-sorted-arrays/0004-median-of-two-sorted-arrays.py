class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums1.extend(nums2)
        nums1.sort()
        s = len(nums1)
        if s%2==0:
            median = (nums1[s//2-1] + nums1[s//2])/2.0
        else:
            median = nums1[s//2]
        return median

        