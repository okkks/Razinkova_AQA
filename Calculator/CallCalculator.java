package Calculator;
import java.util.Scanner;

public class CallCalculator {

    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number and click 'Enter'");

        try {

            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
            }

            System.out.println("Input the arithmetical operator and click 'Enter'");

            char ch = scanner.next().charAt(0);

            System.out.println("Input the second number and click 'Enter'");

            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
            }

            switch (ch) {
                case '+':
                    System.out.print(CalculatorLogic.addition(num1, num2));
                    break;
                case '-':
                    System.out.print(CalculatorLogic.subtraction(num1, num2));
                    break;
                case '*':
                    System.out.print(CalculatorLogic.multiplication(num1, num2));
                    break;
                case '/':
                    System.out.print(CalculatorLogic.division(num1, num2));
                    break;
            }

        } catch (ArithmeticException e) {
            System.err.println("Division by zero is impossible " + e);
        }

    }
}

