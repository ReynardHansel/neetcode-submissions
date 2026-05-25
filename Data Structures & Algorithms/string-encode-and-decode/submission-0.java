class Solution {

    public String encode(List<String> strs) {
        // System.out.println(strs);
        if (strs.isEmpty()) return "";

        // (return this) Place to contain the strings
        StringBuilder encStrings = new StringBuilder();

        for (String s : strs){
            // System.out.println(s);
            encStrings.append(s.length()).append('#').append(s);
        };

        // System.out.println(encStrings.toString());

        return encStrings.toString();
    }

    public List<String> decode(String str) {
        // System.out.println("This is in the decode function");
        System.out.println(str);

        // (return this) Place to contain the strings
        List<String> decStrings = new ArrayList<>();

        // Pointer to track the position of current char in the str String
        int i = 0;

        while (i < str.length()){
            int j = i;

            while (str.charAt(j) != '#'){
                j++;
            };

            System.out.println(str.charAt(i));
            System.out.println(str.charAt(j));

            int length = Integer.parseInt(str.substring(i, j));
            // System.out.println(length);

            // Move the position of i and j to be between the words to be taken (this is for substring() to work)
            i = j + 1;
            j = i + length;
            decStrings.add(str.substring(i, j));

            /*
             * NOTE:
             * move the i to same position as j,
             * to make them both be at same position (much like the starting state),
             * because j's position will be reset to i,
             * if you don't move/reset i's position to j,
             * then j will come back to the position of i,
             * resetting and messing everything
            */
            i = j;
        };

        System.out.println(decStrings);
        return decStrings;
        // return new ArrayList<>();
    }
}
