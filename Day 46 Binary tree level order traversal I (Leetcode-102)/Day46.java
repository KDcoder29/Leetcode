class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> major = new ArrayList<>();
         Queue<TreeNode> q = new LinkedList<>();
         if(root==null) return major;
         
         q.add(root);

         while(q.size()>0){
            int n = q.size();
            List<Integer> minor = new LinkedList<>();
            for(int i=1;i<=n;i++){
                TreeNode remove = q.remove();
                minor.add(remove.val);
                if(remove.left!=null) q.add(remove.left);
                if(remove.right!=null) q.add(remove.right); 
            }
            major.add(minor);
         }
    return major;
    }
}
