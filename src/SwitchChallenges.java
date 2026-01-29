import java.util.Scanner;

public class SwitchChallenges {
    public static void main(String[] args) {

        // 1. - Display name of a day based on number
        // 2. - Display name of a month based on number
        // 3. - Display type of website

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }


        System.out.println("Enter the Month Number");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }


        // Display type of website
        sc.nextLine();

        System.out.println("Enter the any website");
        String website = sc.next();

        String typeOfWebsite = website.substring(website.lastIndexOf('.') + 1, website.length());

        switch (typeOfWebsite) {
            case "com":
                System.out.println("Commerical");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "in":
                System.out.println("India");
                break;
            case "net":
                System.out.println("Network");
                break;
        }
    }
}
