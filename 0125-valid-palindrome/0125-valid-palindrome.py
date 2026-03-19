class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        x = ''.join(i.lower() for i in s if i.isalnum()) 
        return x==x[::-1]