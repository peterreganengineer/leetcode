import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));

            } else if (!stack.empty() && isValidHelper(s.charAt(i), stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        if (stack.size() > 0) {
            return false;
        }
        return true;

    }

    private static boolean isValidHelper(char a, char b) {
        if (a == '}' && b == '{') {
            return true;
        } else if (a == ']' && b == '[') {
            return true;
        } else if (a == ')' && b == '(') {
            return true;
        } else {
            return false;
        }
    }
}
