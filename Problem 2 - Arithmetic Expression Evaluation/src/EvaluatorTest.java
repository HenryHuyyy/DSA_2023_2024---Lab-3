import java.util.*;
public class EvaluatorTest {
    public static void main(String[] args) {
        InfixExpressionEvaluator test = new InfixExpressionEvaluator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = scanner.nextLine();

        Map<Character, Integer> variables = new HashMap<>();
        // Add variables and their values here if needed

        try {
            int result = test.evaluateExpression(expression, variables);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
