import java.util.Stack;

public class PostfixEvaluation {

    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        // Loop through each character in the expression
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // Skip whitespaces
            if (ch == ' ') continue;

            // If it's a digit (operand)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // convert char to int
            }
            // If it's an operator
            else {
                int op2 = stack.pop();
                int op1 = stack.pop();

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
        String postfixExpr = "23*54*+9-";  // Equivalent to: (2*3 + 5*4 - 9)

        int result = evaluatePostfix(postfixExpr);

        System.out.println("Postfix Expression: " + postfixExpr);
        System.out.println("Evaluated Result: " + result);
    }
}
