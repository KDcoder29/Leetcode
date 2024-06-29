class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }
    public static void helper(TreeNode root, ArrayList<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        helper(root.left,result);
        helper(root.right,result);
        
    }
}
