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
    
    int res = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
         pseudoPalindromicPaths(root,new HashMap<Integer,Integer>());
        return res;
    }
    
    public void pseudoPalindromicPaths (TreeNode root, HashMap<Integer,Integer> map) {
        if(root == null) return;
        
        if(!map.containsKey(root.val)) map.put(root.val,1);
        else map.put(root.val, map.get(root.val)+1);
        
        if(root.left == null && root.right == null){
            int odds = 0;
            for(int el : map.values()){
                if(el%2==1) odds++;
                if(odds>1) break;
            }
            if (odds<=1) res++;
        }
        
        pseudoPalindromicPaths(root.left,map);
        pseudoPalindromicPaths(root.right,map);
        map.put(root.val,map.get(root.val)-1);
        
    }
}