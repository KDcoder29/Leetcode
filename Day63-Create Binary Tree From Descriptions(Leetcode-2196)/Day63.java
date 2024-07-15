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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> hm = new HashMap<>();

        for(int i=0;i<descriptions.length;i++){
            int root = descriptions[i][0];
            int lr = descriptions[i][2];
            int child = descriptions[i][1];
            if(hm.containsKey(root)){
                TreeNode n = hm.get(root);
                TreeNode update = addNode(n,lr,child,hm);
                hm.put(root,update);
            }else{
                TreeNode n = createNode(root,child,lr,hm);
                hm.put(root,n);
            }
        }

        for(int i=0;i<descriptions.length;i++){
            int root = descriptions[i][0];
            int lr = descriptions[i][2];
            int child = descriptions[i][1];
            if(hm.containsKey(root)){
                TreeNode n = hm.get(root);
                TreeNode update = addNode(n,lr,child,hm);
                hm.put(root,update);
            }else{
                TreeNode n = createNode(root,child,lr,hm);
                hm.put(root,n);
            }
        }

    TreeNode head = findRoot(descriptions,hm);
    return head;

 
    }
    public static TreeNode createNode(int root, int child,int lr, HashMap<Integer,TreeNode> hm){
        TreeNode node;
        if(hm.containsKey(child)){
            TreeNode presentChild = hm.get(child);
            if(lr==1)  node = new TreeNode(root,presentChild,null);
            else       node = new TreeNode(root,null,presentChild);
        }else{
        if(lr==1){
            TreeNode childNode = new TreeNode(child);
             node = new TreeNode(root,childNode,null);
        }else {
            TreeNode childNode = new TreeNode(child);
            node = new TreeNode(root,null,childNode);
        }
        }
    return node;
    } 

    public static TreeNode addNode(TreeNode n, int lr, int child, HashMap<Integer,TreeNode> hm){
        if(hm.containsKey(child)){
        TreeNode presentChild = hm.get(child);
            if(lr==1){
            n.left= presentChild;
        }else{
            n.right = presentChild;
        }
        }else{
             if(lr==1){
            n.left= new TreeNode(child);
        }else{
            n.right = new TreeNode(child);
        }

        }
        return n;
    }

    public static TreeNode findRoot(int[][] descriptions, HashMap<Integer,TreeNode> hm){
        for(int i=0;i<descriptions.length;i++){
            int compare = descriptions[i][1];
            if(hm.containsKey(compare)){
                hm.remove(compare);
            }
        }
    TreeNode ans=null;
        for(int i=0;i<descriptions.length;i++){
            int val = descriptions[i][0];
            if(hm.containsKey(val)){
                ans=hm.get(val);
            }
        }
    return ans;
    } 
}
