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
    public int countNodes(TreeNode root) {
          if(root == null) return 0;
        int res = 0;
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        
        while(!list.isEmpty()){
            int size = list.size();
            res = res+ list.size();
            while(size>0){
                TreeNode curr = list.poll();
                if(curr.left != null) list.add(curr.left);
                if(curr.right != null) list.add(curr.right);
                size--;
            }
        }
        return res;
    }
}