import java.util.*;

class Solution {
    public int minStickers(String[] stickers, String target) {
        int n = stickers.length;
        int[][] count = new int[n][26];
        
        // Precompute letter frequencies for each sticker
        for (int i = 0; i < n; i++) {
            for (char c : stickers[i].toCharArray()) {
                count[i][c - 'a']++;
            }
        }

        Map<String, Integer> memo = new HashMap<>();
        memo.put("", 0);
        int res = dfs(memo, count, target);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int dfs(Map<String, Integer> memo, int[][] count, String target) {
        if (memo.containsKey(target)) return memo.get(target);

        int[] targetCount = new int[26];
        for (char c : target.toCharArray()) targetCount[c - 'a']++;

        int ans = Integer.MAX_VALUE;

        for (int[] sticker : count) {
            // Optimization: skip sticker if it doesn’t contain the first character of target
            if (sticker[target.charAt(0) - 'a'] == 0) continue;

            // Build the new target after using this sticker
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (targetCount[i] > 0) {
                    int remain = targetCount[i] - sticker[i];
                    for (int j = 0; j < Math.max(0, remain); j++) {
                        sb.append((char) ('a' + i));
                    }
                }
            }

            String newTarget = sb.toString();
            int tmp = dfs(memo, count, newTarget);
            if (tmp != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + tmp);
            }
        }

        memo.put(target, ans);
        return ans;
    }
}
