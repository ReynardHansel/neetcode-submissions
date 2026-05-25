class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // System.out.println(Arrays.toString(strs));
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            // System.out.println(s);
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            String sorted = new String(tempArray);
            // System.out.println(sorted);

            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());

        //  // Create and return a dummy List<List<String>>
        // List<List<String>> dummyList = new ArrayList<>();
        // List<String> innerList = new ArrayList<>();
        // innerList.add("");  // Adding an empty string to the inner list
        // dummyList.add(innerList);  // Adding the inner list to the outer list

        // return dummyList;
    }
}

// Note:
// map.get(sorted).add(s) is just short for:
// List<String> list = map.get(sorted);  // Get the list from the map
// list.add(s);                          // Add 's' to that list

