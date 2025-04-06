import java.util.Stack;

public class PrefixEvaluation {

    // Function to evaluate prefix expression
    public static int evaluatePrefix(String expr) {
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);

            // If it's a whitespace, skip
            if (ch == ' ') continue;

            // If it's a digit (operand)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // convert char to int
            }
            // If it's an operator
            else {
                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                    case '^':
                        stack.push((int)Math.pow(op1, op2));
                        break;
                }
            }
        }

        return stack.pop(); // Final result
    }

    // Main method
    public static void main(String[] args) {
        String prefixExpr = "-+7*45+20"; // Equivalent to: (7 + (4 * 5)) - (2 + 0)

        int result = evaluatePrefix(prefixExpr);

        System.out.println("Prefix Expression: " + prefixExpr);
        System.out.println("Evaluated Result: " + result);
    }
}
