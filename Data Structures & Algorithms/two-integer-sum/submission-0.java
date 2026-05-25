// Flow:
// 1. Create HashMap
// 2. Go to the next index
// 3. Subtract target with the value of that index
// Ex: Target = 10; index = 0; value = 4
//    10 - 4 = 6 --> It means look for the value 6 in our HashMap
// 4. Look for the subtracted value in the HashMap
// 5. If it exists, there you go, you have your combined answer
// 6. If it doesn't, add that value-index to the HashMap
// 7. Loop all over again

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> knownValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int currValue = nums[i];
            // System.out.println(currValue);
            int toFind = target - currValue;
            // System.out.println(toFind);

            if (knownValue.containsKey(toFind)){
                return new int[] {knownValue.get(toFind), i};
            }

            knownValue.put(currValue, i);
        };

        return new int[] {};
    }
}
