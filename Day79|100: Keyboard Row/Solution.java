class Solution {
    public String[] findWords(String[] words) {
        // Define keyboard rows
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        // Create a map to store which row each character belongs to
        Map<Character, Integer> charToRow = new HashMap<>();
        for (char c : row1.toCharArray()) {
            charToRow.put(c, 1);
        }
        for (char c : row2.toCharArray()) {
            charToRow.put(c, 2);
        }
        for (char c : row3.toCharArray()) {
            charToRow.put(c, 3);
        }
        
        List<String> result = new ArrayList<>();
        
        // Check each word
        for (String word : words) {
            if (canBeTypedInOneRow(word, charToRow)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
    
    private boolean canBeTypedInOneRow(String word, Map<Character, Integer> charToRow) {
        if (word.isEmpty()) {
            return true;
        }
        
        // Get the row of the first character (convert to lowercase)
        int row = charToRow.get(Character.toLowerCase(word.charAt(0)));
        
        // Check if all characters belong to the same row
        for (char c : word.toCharArray()) {
            if (charToRow.get(Character.toLowerCase(c)) != row) {
                return false;
            }
        }
        
        return true;
    }
}
