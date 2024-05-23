
// ************NOTE************ Don't run this program. Understand the logic behind this and go to leetcode and solve
import java.util.*;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        st.push(val);
        if (minst.size() == 0) {
            minst.push(val);
            return;
        }
        if (val < minst.peek()) {
            minst.push(val);
        } else {
            minst.push(minst.peek());
        }

    }

    public void pop() {
        st.pop();
        minst.pop();
    }

    public int top() {
        int ans = st.peek();
        return ans;
    }

    public int getMin() {
        if (minst.size() != 0) {
            return minst.peek();
        } else {
            return -1;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
