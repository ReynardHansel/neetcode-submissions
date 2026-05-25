class Solution {
    public boolean hasDuplicate(int[] nums) {
        /* Flow:
            set Hashmap 
            --> loop smua data 
            --> kl data nya ada di hashmap, return true 
            --> kl ngga, tambahin ke hashmap
        */

        HashMap<Integer, Integer> uniques = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(uniques.containsValue(nums[i])) return true;

            uniques.put(i, nums[i]);
        }

        return false;
    };
};
