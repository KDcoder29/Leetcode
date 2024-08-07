import java.util.*;

public class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        
        int i = 0, n = formula.length();
        while (i < n) {
            char ch = formula.charAt(i);
            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (ch == ')') {
                Map<String, Integer> top = stack.pop();
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = (start < i) ? Integer.parseInt(formula.substring(start, i)) : 1;
                
                for (String key : top.keySet()) {
                    int value = top.get(key);
                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + value * multiplicity);
                }
            } else {
                int start = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(start, i);
                
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = (start < i) ? Integer.parseInt(formula.substring(start, i)) : 1;
                
                stack.peek().put(name, stack.peek().getOrDefault(name, 0) + multiplicity);
            }
        }
        
        Map<String, Integer> result = stack.pop();
        TreeMap<String, Integer> sortedResult = new TreeMap<>(result);
        
        StringBuilder sb = new StringBuilder();
        for (String key : sortedResult.keySet()) {
            sb.append(key);
            int count = sortedResult.get(key);
            if (count > 1) sb.append(count);
        }
        
        return sb.toString();
    }
}
