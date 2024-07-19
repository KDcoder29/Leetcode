class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < row; i++ ){
            int minimum=Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                minimum=Math.min(minimum,matrix[i][j]); 
            }
            al.add(minimum);
        }

    List<Integer> al2 = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
        for(int i=0;i<col;i++){
            
            int maximum=Integer.MIN_VALUE;
            for(int j=0;j<row;j++){
                maximum = Math.max(maximum,matrix[j][i]);
            }
            al2.add(maximum);
        }
        
        for(int i=0;i<al.size();i++){
            int num=al.get(i);
            if(al2.contains(num)){
                ans.add(al.get(i));
            }
        }


    return ans;
    }
}
