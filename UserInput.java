// UserInput.java
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public void handleChoice(int choice, Calculator calculator) {
        switch (choice) {
            case 1: case 2: case 3: case 4:
                System.out.println("Enter two numbers: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                performBasicOperation(choice, num1, num2, calculator);
                break;

            case 5:
                System.out.println("Enter Fibonacci index: ");
                int n = scanner.nextInt();
                System.out.println("Fibonacci(" + n + ") = " + calculator.fibonacci(n));
                break;

        }
    }

 private void performBasicOperation(int choice, double a, double b, Calculator calculator) {
        switch (choice) {
            case 1: System.out.println("Result: " + calculator.add(a, b)); break;
            case 2: System.out.println("Result: " + calculator.subtract(a, b)); break;
            case 3: System.out.println("Result: " + calculator.multiply(a, b)); break;
            case 4: System.out.println("Result: " + calculator.divide(a, b)); break;
        }
    }



