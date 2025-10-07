/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
    if (root == null) return paths;

    Stack<TreeNode> nodeStack = new Stack<>();
    Stack<String> pathStack = new Stack<>();

    nodeStack.push(root);
    pathStack.push(String.valueOf(root.val));

    while (!nodeStack.isEmpty()) {
        TreeNode node = nodeStack.pop();
        String path = pathStack.pop();

        if (node.left == null && node.right == null) {
            paths.add(path);
        }

        if (node.right != null) {
            nodeStack.push(node.right);
            pathStack.push(path + "->" + node.right.val);
        }

        if (node.left != null) {
            nodeStack.push(node.left);
            pathStack.push(path + "->" + node.left.val);
        }
    }

    return paths;
    }
}
