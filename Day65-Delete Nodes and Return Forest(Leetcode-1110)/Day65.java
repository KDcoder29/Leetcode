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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
         List<TreeNode> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<to_delete.length;i++){
            hs.add(to_delete[i]);
        }
        if(!hs.contains(root.val)){
            al.add(root);
        }
        travel(root,hs,al);
        return al;
    }
    public static TreeNode travel(TreeNode root, HashSet<Integer> hs,List<TreeNode> al){
        if(root==null) return null;

        root.left=travel(root.left,hs,al);
        root.right=travel(root.right,hs,al);


        if(hs.contains(root.val)){
            if(root.left!=null) {
                al.add(root.left);
                 }
            if(root.right!=null){
                 al.add(root.right);
            }
            return null;
        }
    return root;
    }
}
