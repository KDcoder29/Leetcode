class Solution {
    public int nthUglyNumber(int n) {
        int i2=0,i3=0,i5=0;
        int next2=2;
        int next3=3;
        int next5=5;
        int[] arr = new int[n];
        arr[0]=1;

        for(int i=1;i<n;i++){
            int nextUgly = Math.min(next2,Math.min(next3,next5));
            arr[i]=nextUgly;

            if(nextUgly==next2){
                i2++;
                next2=arr[i2]*2;
            }
             if(nextUgly==next3){
                i3++;
                next3=arr[i3]*3;
            }
             if(nextUgly==next5){
                i5++;
                next5=arr[i5]*5;
            }
        }
        return arr[arr.length-1];
    }
}
