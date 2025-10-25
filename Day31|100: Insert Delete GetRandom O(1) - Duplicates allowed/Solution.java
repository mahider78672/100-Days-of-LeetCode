class RandomizedCollection {

    private List<Integer> nums;
    private Map<Integer, Set<Integer>> idxMap;
    private Random rand;

    public RandomizedCollection() {
        nums = new ArrayList<>();
        idxMap = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        boolean notPresent = !idxMap.containsKey(val);
        idxMap.putIfAbsent(val, new HashSet<>());
        idxMap.get(val).add(nums.size());
        nums.add(val);
        return notPresent;
    }

    public boolean remove(int val) {
        if (!idxMap.containsKey(val) || idxMap.get(val).isEmpty())
            return false;

        // Get an index of val to remove
        int removeIdx = idxMap.get(val).iterator().next();
        idxMap.get(val).remove(removeIdx);

        int lastIdx = nums.size() - 1;
        int lastVal = nums.get(lastIdx);

        // Swap if not removing the last element
        if (removeIdx != lastIdx) {
            nums.set(removeIdx, lastVal);
            idxMap.get(lastVal).remove(lastIdx);
            idxMap.get(lastVal).add(removeIdx);
        }

        nums.remove(lastIdx);

        // Clean up if no more occurrences of val
        if (idxMap.get(val).isEmpty()) {
            idxMap.remove(val);
        }

        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
