import java.util.Scanner;

public class StudentChallenge2 {
    public static void main(String[] args) {
        // Find radix of a number in a string
        // Find a given year is a leap year

        Scanner sc = new Scanner(System.in);

        String number;
        System.out.println("Enter the any Number system ");
        number = sc.next();

        if (number.matches("[01]+")) {
            System.out.println("Binary Number Radix = 2");
        } else if (number.matches("[0-7]+")) {
            System.out.println("Octal System Radix = 8");
        } else if (number.matches("[0-9]+")) {
            System.out.println("Decimal System Radix = 10");
        } else if (number.matches("[0-9A-F]+") || number.matches("[0-9a-f]+")) {
            System.out.println("Hex Decimal Radix = 16");
        } else {
            System.out.println("Invalid Number");
        }

        int year;
        System.out.println("Enter the year ");
        year = sc.nextInt();

        if (year > 0 && year < 4000) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap year");
                    } else {
                        System.out.println("Not Leap year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not Leap year");
            }
        } else {
            System.out.println("Invalid Year");
        }

    }
}
