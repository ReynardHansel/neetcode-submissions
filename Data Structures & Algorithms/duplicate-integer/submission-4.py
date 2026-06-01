class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # print(nums)
        dicc = {}

        for num in nums:
            print(num)
            if dicc.get(num):
                return True
            
            dicc[num] = True

        return False