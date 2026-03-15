class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        numb = set(nums)
        li = []
        for i in range(1, len(nums)+1):
            if i not in numb:
                li.append(i)
        return li
        