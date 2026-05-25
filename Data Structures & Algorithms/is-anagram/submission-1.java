class Solution {
    public boolean isAnagram(String s, String t) {
        // Steps:
        // 1. Check length
        // 2. Create HashMap to store s & t
        // 3. Loop and insert values to HashMap
        // 4. Compare the HashMap

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            // Format:
            // countX.put(key, value)
            // key = char --> s.charAt(i)
            // value = number --> countS.getOrDefault(s.charAt(i) , 0) -> Tambahin 1
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i) , 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i) , 0) + 1);

            // Note:
            // charAt(i) takes/returns the char at index i. So we can use the value as key, etc
            // countS.get(s.charAt(i)) --> returns the number value from the char key (s.charAt(i)). Don't forget to +1 to the value
        };
            // System.out.println(countS);
            // System.out.println(countT);
        return countS.equals(countT);
    }
}