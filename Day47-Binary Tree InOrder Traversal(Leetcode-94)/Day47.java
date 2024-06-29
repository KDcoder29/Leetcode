class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
       
    }
    public static void helper(TreeNode root,List<Integer> result ){
         if(root==null){
            return;
        }
        helper(root.left,result);
        result.add(root.val);
        helper(root.right,result);
        
    }
}
