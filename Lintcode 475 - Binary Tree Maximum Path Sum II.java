Lintcode 475 - Binary Tree Maximum Path Sum II.java
Given a binary tree, find the maximum path sum from root.
The path may end at any node in the tree and contain at least one node in it.
Example
Given the below binary tree:
  1
 / \
2   3
return 4. (1->3)
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    public int maxPathSum2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxPathSum2(root.left);
        int right = maxPathSum2(root.right);
        return Math.max(root.val, Math.max(left, right) + root.val);
    }
}

