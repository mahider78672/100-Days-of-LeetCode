class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // Map to store restaurant names and their indices from list1
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Traverse list2 and check for common strings
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);
                if (sum < minSum) {
                    // Found a smaller index sum, reset result list
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                } else if (sum == minSum) {
                    // Found another restaurant with same minimum index sum
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
