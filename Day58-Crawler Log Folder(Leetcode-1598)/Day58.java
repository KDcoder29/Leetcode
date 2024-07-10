class Solution {
    public int minOperations(String[] logs) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!logs[i].equals("../")  && !logs[i].equals("./")){
                st.push(1);
            }else if(logs[i].equals("../") && st.size()>0){
                st.pop();
            }
        }
        return st.size();
    }
}
