class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }
    public static void helper(TreeNode root,ArrayList<Integer> result){
        if(root==null){
            return;
        }
        helper(root.left,result);
        helper(root.right,result);
        result.add(root.val);
    }
}
