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
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        int sum = 0;
        int maxSum = -10000000;
        int minLevel = 1;
        while(!list.isEmpty()){
            int size = list.size();
            sum = 0;
            while(size>0){
                TreeNode curr = list.poll();
                sum = sum + curr.val;
                size--;
                if(curr.left != null) list.add(curr.left);
                if(curr.right != null) list.add(curr.right);
            }
            if(sum>maxSum){
                minLevel = level;
                maxSum = sum;
            }
            level++;
        }
        
        return minLevel;
    }
}