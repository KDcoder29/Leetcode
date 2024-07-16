class Solution {
    StringBuilder leftPath = new StringBuilder();
    StringBuilder rightPath = new StringBuilder();

    public String getDirections(TreeNode root, int startValue, int destValue) {
        findPath(root, startValue, leftPath, true);
        findPath(root, destValue, rightPath, true);

        leftPath.reverse();
        rightPath.reverse();

        int i = 0;
        while (i < leftPath.length() && i < rightPath.length() && leftPath.charAt(i) == rightPath.charAt(i)) {
            i++;
        }
        int var = i;
        char[] arr = new char[leftPath.length()];

        while(i<leftPath.length()){
            arr[i]='U';
            i++;
        }
        String leftpath = new String(arr);

        return leftpath.substring(var) + rightPath.substring(var);
    }

    private boolean findPath(TreeNode root, int target, StringBuilder path, boolean isLeft) {
        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        }

        if (findPath(root.left, target, path, true)) {
            path.append('L');
            return true;
        }

        if (findPath(root.right, target, path, true)) {
            path.append('R');
            return true;
        }

        return false;
    }
}
