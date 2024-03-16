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
    public int sumOfLeftLeaves(TreeNode root) {
          int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                TreeNode node = queue.poll();
                
                if(node.left != null) {
                    if(node.left.left==null && node.left.right==null) sum = sum + node.left.val;
                    queue.add(node.left);
                }
                if(node.right != null) queue.add(node.right);
                size--;
            }
        }
        return sum;
    }
}