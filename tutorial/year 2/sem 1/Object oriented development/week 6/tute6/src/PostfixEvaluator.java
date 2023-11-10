import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PostfixEvaluator \"postfix_expression\"");
            return;
        }

        String postfixExpression = args[0];
        double result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }

    public static double evaluatePostfix(String postfixExpression) {
        String[] tokens = postfixExpression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    System.out.println("Invalid postfix expression.");
                    System.exit(1);
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 == 0) {
                            System.out.println("Division by zero error.");
                            System.exit(1);
                        }
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        System.out.println("Invalid operator: " + token);
                        System.exit(1);
                }
            }
        }

        if (stack.size() != 1) {
            System.out.println("Invalid postfix expression.");
            System.exit(1);
        }

        return stack.pop();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
