class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode node, List<Integer> result) {
        if (node == null) return;

        helper(node.left, result);   // Left
        result.add(node.val);        // Root
        helper(node.right, result);  // Right
    }
}