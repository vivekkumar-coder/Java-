import java.util.Scanner;

public class StudentChallenge3 {
    public static void main(String[] args) {
        // Display name of a day based on number
        // Find type of website and the protocol used

        Scanner sc = new Scanner(System.in);

        int dayNumber;
        System.out.println("Enter the day number 1-7 ");
        dayNumber = sc.nextInt();

        if(dayNumber == 1) {
            System.out.println("Monday");
        }
        else if(dayNumber == 2) {
            System.out.println("Tuesday");
        }
        else if(dayNumber == 3) {
            System.out.println("Wednesday");
        }
        else if(dayNumber == 4) {
            System.out.println("Thursday");
        }
        else if(dayNumber == 5) {
            System.out.println("Friday");
        }
        else if(dayNumber == 6) {
            System.out.println("Saturday");
        }
        else if(dayNumber == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid Day Number");
        }













        sc.nextLine();
        System.out.println("Enter a URL");
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(':'));

        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        else if(protocol.equals("https"))
            System.out.println("Hypertext Transfer Protocol");


        String ext = url.substring(url.lastIndexOf('.') + 1, url.length());

        if(ext.equals("com"))
            System.out.println("Commerical");
        else if(ext.equals("org"))
            System.out.println("Organisation");
        else if(ext.equals("net"))
            System.out.println("Network");
        else if(ext.equals("in"))
            System.out.println("India");
        else if(ext.equals("uk"))
            System.out.println("United Kingdom");
    }
}
