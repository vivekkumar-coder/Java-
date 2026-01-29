import java.util.Scanner;

public class ChallengeOfArithmeticsBySwitch {
    public static void main(String[] args) {
        // Make a Menu Driven for Arithmetic Operations

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Operator ");
        char operator = scan.next().charAt(0);

        System.out.println("Enter two number of operation of  arithmatic ");
        int numberFirst = scan.nextInt();
        int numberSecond = scan.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Addition " + (numberFirst + numberSecond));
                break;
            case '-':
                System.out.println("Substraction " + (numberFirst + numberSecond));
                break;
            case '*':
                System.out.println("Multiplication " + (numberFirst * numberSecond));
                break;
            case '/':
                System.out.println("Division " + (((float) (numberFirst)) / numberSecond));
                break;
            case '%':
                System.out.println("Modulo " + (numberFirst % numberSecond));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }



        // By Abdul Bari

        System.out.println("Menu \n 1. ADD \n 2. SUB \n 3. MUL \n 4. DIV \nEnter two number : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter option in words: ");

        String operatorName = scan.next();
        operatorName = operatorName.toUpperCase();

        switch (operatorName) {
            case "ADD":
                System.out.println("Additon " + (num1 + num2));
                break;
            case "SUB":
                System.out.println("Substraction " + (num1 - num2));
                break;
            case "MUL":
                System.out.println("Multiplication " + (num1 * num2));
                break;
            case "DIV":
                System.out.println("Division " + ((float) (num1) / num2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
