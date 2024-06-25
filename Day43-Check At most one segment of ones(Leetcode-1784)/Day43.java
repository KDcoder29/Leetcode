class Solution {
    public boolean checkOnesSegment(String s) {
       
       int i = 1;
       while(i<s.length() && s.charAt(i)=='1'){
        i++;
       }
       
       while(i<s.length()){
        if(s.charAt(i)=='1'){
        return false;}
        i++;
       }

        return true;
    }
}
