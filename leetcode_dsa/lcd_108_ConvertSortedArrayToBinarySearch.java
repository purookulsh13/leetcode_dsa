/**
 * Problem: Convert Sorted Array to Binary Search Tree
 * Given an array where elements are sorted in ascending order, 
 * convert it to a height-balanced binary search tree.
 * 
 * Example:
 * Input: [-10, -3, 0, 5, 9]
 * Output: A height-balanced binary search tree, which is:
 * 
 *      0
 *     / \
 *   -3   9
 *   /   /
 * -10  5
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int arrLen = nums.length;
        if (arrLen == 0) {
            return null;
        }
        return generateBST(nums, 0, arrLen - 1);
    }

    public TreeNode generateBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = generateBST(nums, start, mid - 1);
        root.right = generateBST(nums, mid + 1, end);
        return root;
    }
}

/*
 * Solution Explanation:
 * The given problem requires us to convert a sorted array into a height-balanced BST. 
 * A height-balanced BST is defined as a binary tree in which the depth of the two subtrees 
 * of every node never differs by more than 1.
 *
 * 1. First, we define a `TreeNode` class representing a node in the binary tree.
 * 2. The `sortedArrayToBST` method initializes the process by calling a helper method `generateBST`.
 * 3. In `generateBST`, we use a recursive approach to construct the BST:
 *    a. The base case is when the start index exceeds the end index, in which case we return null.
 *    b. We find the middle element of the current subarray to ensure the tree remains balanced.
 *    c. We create a new `TreeNode` with this middle element as the root.
 *    d. We recursively generate the left subtree using the left half of the current subarray.
 *    e. We recursively generate the right subtree using the right half of the current subarray.
 *    f. Finally, we return the root node of the constructed subtree.
 *
 * This approach ensures that the constructed binary tree is height-balanced, as each recursive call 
 * splits the subarray into two halves, thereby distributing the elements evenly between the left 
 * and right subtrees.
 */
