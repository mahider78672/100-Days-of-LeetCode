class Solution {
    public int maxOperations(String s) {
        int operations = 0;
        int onesCount = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                onesCount++;
            } else {
                // We found a '0'
                // Check if there was a '1' before this '0'
                if (i > 0 && s.charAt(i - 1) == '1') {
                    // All the '1's we've seen so far will move past this group of '0's
                    operations += onesCount;
                }
            }
        }
        
        return operations;
    }
}
