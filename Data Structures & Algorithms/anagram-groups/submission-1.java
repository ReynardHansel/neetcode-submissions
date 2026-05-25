class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // System.out.println(Arrays.toString(strs));

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            // System.out.println(s);
            int[] combination = new int[26];
            char[] separated = s.toCharArray(); // Needed for loop method #1

            // For loop method #1
            for (int i = 0; i < s.length(); i++){
                // System.out.println(seperated[i]);
                combination[separated[i] - 'a']++;
            }

            // For loop method #2
            // for (char c : s.toCharArray()){
            //     // System.out.println(c);
            //     combination[c - 'a']++;
            // }

            String key = Arrays.toString(combination);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(s);

            // System.out.println(combination);
            // System.out.println(key);
        }

        return new ArrayList<>(map.values());

        // Create and return a dummy List<List<String>>
        // List<List<String>> dummyList = new ArrayList<>();
        // List<String> innerList = new ArrayList<>();
        // innerList.add("");  // Adding an empty string to the inner list
        // dummyList.add(innerList);  // Adding the inner list to the outer list

        // return dummyList;
    }
}