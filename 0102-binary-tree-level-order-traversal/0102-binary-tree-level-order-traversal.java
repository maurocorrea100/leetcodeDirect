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
   public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        levelOrder(root,0,map);
        
        for(List<Integer> el : map.values()){
            res.add(el);
        }
        
        return res;
    }

    public void levelOrder(TreeNode root, int index,  Map<Integer, List<Integer>> map ) {
        if(root == null ) return;

        if(map.containsKey(index)) map.get(index).add(root.val);
        else map.put(index, new ArrayList<>(Arrays.asList(root.val)));
        index++;
        levelOrder(root.left,index,map);
        levelOrder(root.right,index,map);
    }
}