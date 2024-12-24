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
    public TreeNode reverseOddLevels(TreeNode root) {
       
       
         Queue<TreeNode> q = new LinkedList<>();
        if(root == null || root.left == null) return root;
        
        q.offer(root);
        int level=0;

        while(!q.isEmpty()){
            int size = q.size();
            
            while(size-->0){
                TreeNode temp = q.poll();
                if(temp.left != null){
                    q.offer(temp.left);
                    q.offer(temp.right);
                }
            }
            
            level++;
                
            if(level%2==1 && !q.isEmpty()){
                    int[] arr = new int[q.size()];
                    int i = 0;
                    for(TreeNode node : q) arr[i++] = node.val;
                    i--;
                    for(TreeNode node : q) node.val = arr[i--];
            }
        }

        return root;
    }
}