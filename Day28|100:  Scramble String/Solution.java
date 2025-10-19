class Solution {
    public boolean isScramble(String s1, String s2) {
        java.util.Map<String, Boolean> memo = new java.util.HashMap<>();

        java.util.function.BiFunction<String, String, Boolean> helper = new java.util.function.BiFunction<>() {
            public Boolean apply(String a, String b) {
                String key = a + "#" + b;
                if (memo.containsKey(key)) return memo.get(key);

                if (a.equals(b)) {
                    memo.put(key, true);
                    return true;
                }
                if (!hasSameChars(a, b)) {
                    memo.put(key, false);
                    return false;
                }

                int n = a.length();
                for (int i = 1; i < n; i++) {
                    // no swap
                    if (this.apply(a.substring(0, i), b.substring(0, i)) &&
                        this.apply(a.substring(i), b.substring(i))) {
                        memo.put(key, true);
                        return true;
                    }
                    // swap
                    if (this.apply(a.substring(0, i), b.substring(n - i)) &&
                        this.apply(a.substring(i), b.substring(0, n - i))) {
                        memo.put(key, true);
                        return true;
                    }
                }

                memo.put(key, false);
                return false;
            }

            private boolean hasSameChars(String x, String y) {
                int[] count = new int[26];
                for (int i = 0; i < x.length(); i++) {
                    count[x.charAt(i) - 'a']++;
                    count[y.charAt(i) - 'a']--;
                }
                for (int c : count) {
                    if (c != 0) return false;
                }
                return true;
            }
        };

        return helper.apply(s1, s2);
    }
}
