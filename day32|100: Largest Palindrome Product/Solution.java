class Solution {
    public int largestPalindrome(int n) {
         if (n == 1) return 9; // Base case

        long upper = (long)Math.pow(10, n) - 1;
        long lower = (long)Math.pow(10, n - 1);

        for (long left = upper; left >= lower; left--) {
            // Construct palindrome by mirroring the left half
            String s = String.valueOf(left);
            long pal = Long.parseLong(s + new StringBuilder(s).reverse().toString());

            // Check if this palindrome can be factored into two n-digit numbers
            for (long x = upper; x * x >= pal; x--) {
                if (pal % x == 0) {
                    long y = pal / x;
                    if (y >= lower && y <= upper)
                        return (int)(pal % 1337);
                }
            }
        }

        return 0;
    }
}
