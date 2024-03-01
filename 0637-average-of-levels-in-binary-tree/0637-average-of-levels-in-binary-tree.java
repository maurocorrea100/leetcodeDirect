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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
       
        if(root != null ) queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int amount = size;
            double av = 0;
            double sum = 0;
            while(size>0){
                TreeNode node = queue.poll();
                sum = sum + node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                size--;
            }
            
            av = sum/amount;
            res.add(av);
        }

        return res;
    }
}