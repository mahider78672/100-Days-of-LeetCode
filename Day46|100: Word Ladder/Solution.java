import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0; // endWord must exist in wordList

        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(beginWord, 1));

        while (!queue.isEmpty()) {
            Pair<String, Integer> current = queue.poll();
            String word = current.getKey();
            int length = current.getValue();

            if (word.equals(endWord)) return length; // found the shortest path

            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char original = chars[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == original) continue;
                    chars[i] = c;
                    String nextWord = new String(chars);

                    if (wordSet.contains(nextWord)) {
                        queue.offer(new Pair<>(nextWord, length + 1));
                        wordSet.remove(nextWord); // avoid revisiting
                    }
                }
                chars[i] = original; // restore original character
            }
        }
        return 0; // no transformation found
    }
}
