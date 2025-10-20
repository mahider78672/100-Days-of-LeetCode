class Solution {
    public boolean isValidSerialization(String preorder) {
         String[] nodes = preorder.split(",");
        int slots = 1; // Start with 1 slot for the root

        for (String node : nodes) {
            slots--; // Every node occupies one slot
            if (slots < 0) return false; // No slot available

            if (!node.equals("#")) {
                slots += 2; // Non-null node creates two child slots
            }
        }

        return slots == 0; // All slots must be used up
    }
}
