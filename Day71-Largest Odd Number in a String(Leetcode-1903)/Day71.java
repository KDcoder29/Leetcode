class Solution {
    public String largestOddNumber(String num) {
        char[] arr = num.toCharArray();
        int idx=0;
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            int a = Character.getNumericValue(arr[i]);
            idx=i;
            if(a%2==1){
                count++;
                break;
            }
        }
        if(idx==0 && count==0) return "";
        return num.substring(0,idx+1);
    }
}
