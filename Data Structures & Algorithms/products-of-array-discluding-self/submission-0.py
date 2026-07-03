class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # print(nums)

        length = len(nums)
        result = [1] * length
        # print(f"result: {result}, len: {length}")

        prefix = 1
        for i in range(length):
            # print(i)
            result[i] *= prefix
            prefix *= nums[i]
        
        postfix = 1
        for j in range(length -1, -1, -1):
            # print(j)
            result[j] *= postfix
            postfix *= nums[j]
        print(result)

        return result