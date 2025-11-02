class Solution {
    public String getPermutation(int n, int k) {
        // Step 1: Initialize list of numbers 1 to n
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Step 2: Precompute factorials
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        // Step 3: Convert k to zero-based index
        k--;

        // Step 4: Build the permutation
        StringBuilder result = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            int index = k / fact[i - 1];
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= fact[i - 1];
        }

        return result.toString();
    }
}
