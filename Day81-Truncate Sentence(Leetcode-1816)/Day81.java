class Solution {
    public String truncateSentence(String s, int k) {
        int j=0;
        while(s.charAt(j)==' '){
            j++;
        }
        int eidx=0;
        for(int i=j;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                k--;
            }
            if(k==0){
                eidx=i;
                break;
            }
        }
    if(eidx>=s.length()-1){
        return s;
    }else{
      return  s.substring(j,eidx);
    }
    }
}
