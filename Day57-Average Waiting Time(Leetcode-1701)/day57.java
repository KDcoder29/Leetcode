class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prepared =0;
        long totalWaiting=0;
        for(int i=0;i<customers.length;i++){
            int arrivalTime=customers[i][0];
            int preparationTime=customers[i][1];

            if(prepared>arrivalTime){
                prepared=prepared+preparationTime;
            }else{
                prepared=arrivalTime+preparationTime;
            }
            int waitingTime = prepared-arrivalTime;
            totalWaiting+=waitingTime;
         }

        return (double) totalWaiting / customers.length;
    }
}
