class Solution {
    public static double myPow(double x, int n) {
      if (n == Integer.MIN_VALUE) {  
            return (x == 1.0 || x == -1.0) ? 1.0 : 0.0;  
        }
       if(n==0){
        return 1;
       }
       else if (n<0) {  
             n = Math.abs(n);
       double result = power(x,n);
       return 1/result;
        }else{
             double result = power(x,n);
            return result;
        }

    }
    public static double power(double x, int n){
         if(n==1){
            return x;
        }

        double temp = myPow(x,n/2);
        if(n%2==0){
            return temp*temp;
        }else{
            return temp*temp*x;
        }
    }
}
