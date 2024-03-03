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
    public TreeNode replaceValueInTree(TreeNode root) {
        TreeNode node = root;
        node.val = 0;
        Deque<TreeNode> list = new LinkedList<>();
        list.add(node.left);
        list.add(node.right);


        while(!list.isEmpty()){
            int size = list.size();
            int sum = 0;
            // calculate sum
            while(size>0){
                TreeNode curr = list.pollFirst();
                if(curr != null) {
                    sum = sum + curr.val;
                }
                list.addLast(curr);
                size--;
            }

            size = list.size();
            while(size>0){
                TreeNode node1 = list.pollFirst();
                TreeNode node2 = list.pollFirst();
                int lVal = node1 != null ? node1.val : 0;
                int rVal = node2 != null ? node2.val : 0;

                if(node1 != null) node1.val = sum - lVal - rVal;
                if(node2 != null) node2.val = sum - lVal - rVal;

                if(node1 != null ) list.add(node1.left);
                if(node1 != null ) list.add(node1.right);

                if(node2 != null ) list.add(node2.left);
                if(node2 != null ) list.add(node2.right);

                size = size - 2;

            }
        }
        
        return root;
    }
}