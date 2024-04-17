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
public String smallestFromLeaf(TreeNode root) {
    
    String[] result = new String[]{null};
    helper(result, new StringBuilder(), root);
    
    return result[0];
}

private void helper(String[] result, StringBuilder currPath, TreeNode currNode) {
    
    if (currNode == null) return;
    
    currPath.append((char)('a' + currNode.val));
    
    if (currNode.left == null && currNode.right == null) {
        
        String candidate = new StringBuilder(currPath).reverse().toString();   // reverse because paths should be from leaf to root and not from root to leaf
        if (result[0] == null || result[0].compareTo(candidate) > 0) {
            result[0] = candidate;   
        }
        
    } else {
        helper(result, currPath, currNode.left);
        helper(result, currPath, currNode.right);
    }
    
    currPath.setLength(currPath.length() - 1);      // backtrack
}
}