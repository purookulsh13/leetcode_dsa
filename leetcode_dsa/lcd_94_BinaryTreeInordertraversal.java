/*
 * Problem : Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]
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
    List<Integer> ans = new ArrayList<>();
 
     public void helper (TreeNode root) {
         if ( root == null) {
             return;
         }
         helper(root.left);
         ans.add(root.val);
         helper(root.right);
     }
 
     public List<Integer> inorderTraversal(TreeNode root) {
         helper (root);
         return ans;
     }
 
     
 }
 
 /*
  * Solution:
  *          The problem requires performing an inorder traversal of a binary tree and returning the values in a list.
  *          
  *          1. Inorder Traversal involves visiting nodes in the following order:
  *             - Traverse the left subtree.
  *             - Visit the current node.
  *             - Traverse the right subtree.
  *          
  *          2. The `helper` method performs the recursive inorder traversal:
  *             - It first traverses the left subtree.
  *             - Then adds the current node's value to the `ans` list.
  *             - Finally, it traverses the right subtree.
  *          
  *          3. The `inorderTraversal` method initializes the traversal by calling the `helper` method and then returns the list of values.
  *          
  *          The time complexity of this approach is O(n), where `n` is the number of nodes in the binary tree, as each node is visited once.
  *          The space complexity is O(h), where `h` is the height of the tree, due to the recursion stack.
  */
 