/*
 * Flow:
 * Create HashMap (value - how much that value appears)
 * Create BucketList/Sort (to sort by how much the value appears)
 * Index = How much that value appears (n)
 * Value = List of value that appears n times
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Initialize the hashmap and insert values
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        };
        // System.out.println(map.entrySet());

        // Initialize BucketList/Sort and insert values
        List<Integer>[] frequency = new List[nums.length + 1];
        for (int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        };

        for (Map.Entry<Integer, Integer> data : map.entrySet()){
            frequency[data.getValue()].add(data.getKey());
        };

        int[] result = new int[k];
        int index_tracker = 0;

        for (int i = frequency.length - 1; i > 0; i--){
            for (int n : frequency[i]){
                result[index_tracker] = n;
                index_tracker++;

                if (index_tracker == k) return result;
            };
        };

        //* For printing out isi si list
        // for (int i = 0; i < frequency.length; i++) {
        //     // Check if the list at index i is not empty
        //     // if (!frequency[i].isEmpty()) {
        //         System.out.print("frequency " + i + ": ");
        //         for (int num : frequency[i]) {
        //             System.out.print(num + " ");
        //         }
        //         System.out.println();  // Move to the next line after printing all numbers in the list
        //     // }
        // }


        // Dummy return
        return new int[]{0,0};
    }
}
