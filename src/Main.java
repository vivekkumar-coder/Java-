public class Main {
    public static void main(String[] args) {


       int n = 5;

       if(n==1)
       {
           System.out.println("One");
       }
       else if(n==2)
       {
           System.out.println("Two");
       }
       else if(n==3)
       {
           System.out.println("Three");
       }
       else
       {
           System.out.println("Invalid Number");
       }



       switch(n)
       {
           case 1: System.out.println("One");
                    break;
           case 2: System.out.println("Two");
                    break;
           case 3: System.out.println("Three");
                    break;
           default:
               System.out.println("Not Valid");
       }
    }

}