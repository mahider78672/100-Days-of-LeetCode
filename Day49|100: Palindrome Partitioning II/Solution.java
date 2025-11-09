class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPal = new boolean[n][n];
        int[] cuts = new int[n];

        for (int i = 0; i < n; i++) {
            int minCuts = i; // maximum cuts possible (cut before every char)
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 1 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                    // if palindrome starts at index 0, no cut needed
                    minCuts = (j == 0) ? 0 : Math.min(minCuts, cuts[j - 1] + 1);
                }
            }
            cuts[i] = minCuts;
        }

        return cuts[n - 1];
    }
}
