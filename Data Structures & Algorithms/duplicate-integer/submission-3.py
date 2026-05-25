class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # print(nums)
        
        dict_hashmap = {}
        for value in nums:
            # print(value)

            # print(dict_hashmap.values())
            if(dict_hashmap.get(value)): return True
            dict_hashmap[value] = True

        return False