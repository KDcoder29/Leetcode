class Solution {
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=0;
            if(arr[i]=='('){
                st.push(i);
            }else if(arr[i]==')'){
                start=st.pop()+1;
                end=i-1;
                reverse(start,end,arr);
            }
        }
    String str = new String(arr);
    StringBuilder convert = new StringBuilder(str);
    for(int i=0;i<convert.length();i++){
        if(convert.charAt(i)=='(' || convert.charAt(i)==')'){
            convert.deleteCharAt(i);
            i--;
        }
    }
    String ans = convert.toString();
    return ans;
    }
    public static void reverse(int s, int e, char[] arr){
        while(s<e){
            char temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
