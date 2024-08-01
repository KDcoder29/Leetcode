class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(int i=0;i<details.length;i++){
        char c1 = details[i].charAt(11);
        char c2 = details[i].charAt(12);
        int a = Character.getNumericValue(c1);
        int b = Character.getNumericValue(c2);
        int age = a*10+b;
        if(age>60){
            ans++;
        }
        } 
    return ans;
    }
}
