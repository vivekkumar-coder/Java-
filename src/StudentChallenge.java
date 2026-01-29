import java.util.Scanner;

public class StudentChallenge {
    public static void main(String[] args) {
        // find a number is odd or even
        // find person is young or not young
        // find grades for given marks

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("This is odd number");
            } else {
                System.out.println("This is even number");
            }
        } else {
            System.out.println("Invalid number");
        }

        float age;
        System.out.println("Enter the age ");
        age = sc.nextFloat();

        if (age > 0) {
            if (age >= 18 && age <= 60) {
                System.out.println("Young");
            } else {
                System.out.println("Not Young");
            }
        } else {
            System.out.println("Enter the Invalid number");
        }


        int mark1, mark2, mark3, mark4, mark5;
        System.out.println("Enter the marks of five subject ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        mark4 = sc.nextInt();
        mark5 = sc.nextInt();

        int avgMark = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
        if (avgMark <= 100) {
            if (avgMark >= 80) {
                System.out.println('A');
            } else if (avgMark >= 70) {
                System.out.println('B');
            } else if (avgMark >= 60) {
                System.out.println('C');
            } else if (avgMark >= 50) {
                System.out.println('D');
            } else if (avgMark >= 40) {
                System.out.println('E');
            } else {
                System.out.println('F');
            }
        } else {
            System.out.println("Invalid Mark");
        }
    }
}
