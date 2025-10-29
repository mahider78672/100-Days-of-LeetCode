class Solution {
    public boolean isNumber(String s) {
          s = s.trim();
        // Regular expression for a valid number
        String numberRegex = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        return s.matches(numberRegex);
    }
}
