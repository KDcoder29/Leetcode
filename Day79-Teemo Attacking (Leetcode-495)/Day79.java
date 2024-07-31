class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count =0;
        int totalSeconds = 0;
        int currentAdd=0;
        int prevAdd=0;
        for(int i=0;i<timeSeries.length;i++){
            if(count==0) {
                totalSeconds+=duration;
                count++; 
                currentAdd=timeSeries[i]+duration;
                continue;
                }
                currentAdd=timeSeries[i]+duration;
                prevAdd=timeSeries[i-1]+duration;
                int diff=currentAdd-prevAdd;
                if(diff>=duration){
                    totalSeconds+=duration;
                }else{
                    totalSeconds+=diff;
                }
            
        }
 return totalSeconds;   
    }
}
