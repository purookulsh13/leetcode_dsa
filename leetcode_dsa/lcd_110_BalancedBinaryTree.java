/**
 * Problem: Check if a Binary Tree is Height-Balanced
 * A binary tree is height-balanced if the depth of the two subtrees of every node never differs by more than 1.
 * 
 * Example:
 * Input: [3,9,20,null,null,15,7]
 * Output: true
 * Explanation: The given tree is [3,9,20,null,null,15,7], which is height-balanced.
 *
 *      3
 *     / \
 *    9  20
 *      /  \
 *     15   7
 */

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
    private boolean result = true;
    
    public boolean isBalanced(TreeNode root) {
        validate(root);
        return result;
    }
    
    public int validate(TreeNode root){
        if(root == null) return 0;
        int l = validate(root.left);
        int r = validate(root.right);
        
        if(Math.abs(l - r) > 1)
            result = false;
        
        return 1 + Math.max(l, r);
    }
}


/*
 * Solution Explanation:
 * The given problem requires us to determine if a binary tree is height-balanced. 
 * A height-balanced tree is defined as a binary tree in which the depth of the two subtrees 
 * of every node never differs by more than 1.
 *
 * 1. We define a `TreeNode` class representing a node in the binary tree.
 * 2. The `isBalanced` method initializes the process by calling a helper method `validate`.
 * 3. In `validate`, we use a recursive approach to check the balance and calculate the height of the tree:
 *    a. The base case is when the current node is null, in which case we return a height of 0.
 *    b. We recursively validate the left and right subtrees and calculate their heights.
 *    c. We check if the current node's subtree is balanced by comparing the heights of the left and right subtrees.
 *       If the absolute difference in heights is greater than 1, we update the `result` to false.
 *    d. We return the height of the current subtree, which is 1 plus the maximum of the left and right subtree heights.
 * 4. The `isBalanced` method returns the final value of `result`, indicating whether the tree is height-balanced.
 *
 * This approach ensures that we check the balance of the tree at every node and calculate the height of each subtree.
 */