class Solution(object):
    def isPalindrome(self, x):
        num = 0
        numcopy = x
        while(x>0):
            digit = x%10
            num = num*10+digit
            x//=10
        if num==numcopy:
            return True
        else:
            return False