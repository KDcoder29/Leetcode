class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int finalProfit=0;

        for(int i=0;i<worker.length;i++){
            int innerProfit =0;
            for(int j=0;j<difficulty.length;j++){
                int tempProfit=0;
                if(worker[i]>=difficulty[j]){
                    tempProfit=profit[j];
                }
                innerProfit=Math.max(innerProfit,tempProfit);
            }
            finalProfit=finalProfit+innerProfit;
        }
    return finalProfit;
    }
}
