class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        print(nums)
        print(target)

        keys = {}
        for i in range(len(nums)):
            existingKey = target - nums[i]
            print(f"target: {target}")
            print(f"currentKey: {nums[i]}")
            print(f"existingKey: {existingKey}")
            print("-> Getting existing key")
            print(keys.get(existingKey))
            if keys.get(existingKey) != None:
                print("HEY, YOU GOT HERE!")
                return [keys[existingKey], i]

            [print("No existingKey found, adding to keys")]
            keys[nums[i]] = i
            print(keys)
            print("=====================")



# Logic:
# if target - currKey = existingKey
# return [currKey, existingKey]