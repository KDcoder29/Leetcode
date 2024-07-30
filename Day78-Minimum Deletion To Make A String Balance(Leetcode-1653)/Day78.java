class Solution {
    public int minimumDeletions(String s) {
        int ans =0;
        int count =0;
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(i=='b')
            count++;
            else if(count>0){
                ans++;
                count--;
            }
        }
    return ans;
    }
}
