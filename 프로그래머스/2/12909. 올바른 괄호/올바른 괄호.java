import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
//         String[] s1 = s.split("");
        
//         if (s1[0] == ")") {
//             return false;
//         }
        
//         for (int i = 0; i < s1.length; i++) {
//             if (i % 2 != 0) {
                
//             }
            
            
//         }
        Stack<Character> stack = new Stack<>();
        
        for (char item : s.toCharArray()) {
            if (item == '(') {
                stack.push('(');
            } else {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        
        
        
        return stack.isEmpty()?true : false;
    }
}