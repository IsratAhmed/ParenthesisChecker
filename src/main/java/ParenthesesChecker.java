import java.util.Stack;

public class ParenthesesChecker {

    public static boolean checkParentheses(String testString) {

        Stack<Character> checker = new Stack<>();

        for (int i = 0; i < testString.length(); i++){

            char bracket = testString.charAt(i);

            if (bracket == '(' || bracket == '{' || bracket == '[' || bracket == '<'){
                checker.push((bracket));
            } else if (bracket == ')' || bracket == '}' || bracket == ']' || bracket == '>'){
                if (checker.empty()) {
                    return false;
                } else {
                    if ((checker.peek() == '(' && bracket == ')') || (checker.peek() == '{' && bracket == '}') || (checker.peek() == '[' && bracket == ']') || (checker.peek() == '<' && bracket == '>')){
                        checker.pop();
                    }
                }
            }

        }

        if (checker.empty()){
            return true;
        } else {
            return false;
        }

    }
}
