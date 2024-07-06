class Solution {
    public int passThePillow(int n, int time) {
        if(time<n){
            return time+1;
        }

        boolean forward = true;
        int pillow=1;
        while(time!=0){
            if(forward){
                pillow++;
                if(pillow==n) forward = false;
            }else{
                pillow--;
                if(pillow==1) forward = true;
            }
            time--;

        }
    return pillow;
    }
}
