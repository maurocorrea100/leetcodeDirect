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
    public boolean isCousins(TreeNode root, int x, int y) {
         Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean xFound = false, yFound=false;
        while(!queue.isEmpty()){
            int size = queue.size();
            
            while(size>0){
                TreeNode curr = queue.poll();
                 if(curr.left != null && curr.right != null){
                    if((curr.left.val == x || curr.left.val == y) && (curr.right.val == x || curr.right.val == y)){
                        return false;
                    }
                }
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
                if(curr.val==x) xFound = true;
                if(curr.val==y) yFound = true;
                size--;
            }
            if(xFound && yFound) return true;
            if(xFound && !yFound) return false;
            if(!xFound && yFound) return false;
        }
        
        return false;
    }
}