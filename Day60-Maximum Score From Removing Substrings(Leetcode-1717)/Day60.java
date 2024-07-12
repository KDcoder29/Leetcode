import java.util.Stack;
class Solution {
    public int maximumGain(String s, int x, int y) {
       Stack<Character> st = new Stack<>();
       int score = 0;
       
       if (x > y) {
           for (int i = 0; i < s.length(); i++) {
               if (s.charAt(i) != 'b') {
                   st.push(s.charAt(i));
               } else if (!st.isEmpty() && st.peek() == 'a') {
                   st.pop();
                   score += x;
               } else {
                   st.push(s.charAt(i));
               }
           }
       } else {
           for (int i = 0; i < s.length(); i++) {
               if (s.charAt(i) != 'a') {
                   st.push(s.charAt(i));
               } else if (!st.isEmpty() && st.peek() == 'b') {
                   st.pop();
                   score += y;
               } else {
                   st.push(s.charAt(i));
               }
           }
       }

       StringBuilder sb = new StringBuilder();
       while (!st.isEmpty()) {
           sb.append(st.pop());
       }
       String reduced = sb.reverse().toString();

       st.clear();

       if (x > y) {
           for (int i = 0; i < reduced.length(); i++) {
               if (reduced.charAt(i) != 'a') {
                   st.push(reduced.charAt(i));
               } else if (!st.isEmpty() && st.peek() == 'b') {
                   st.pop();
                   score += y;  
               } else {
                   st.push(reduced.charAt(i));
               }
           }
       } else {
           for (int i = 0; i < reduced.length(); i++) {
               if (reduced.charAt(i) != 'b') {
                   st.push(reduced.charAt(i));
               } else if (!st.isEmpty() && st.peek() == 'a') {
                   st.pop();
                   score += x;  
               } else {
                   st.push(reduced.charAt(i));
               }
           }
       }
       
       return score;
    }
}
