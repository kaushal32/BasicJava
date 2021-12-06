import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
//        String name = "Kaushal";
//        String surname = "Kumar";
//        int age = 19;
//        System.out.println(name + surname + age);

        //Non-primitive data type
//        String name ="kaushal";
//        System.out.println(name.length());

        //Strings
        //concatenate
//        String name1 ="kaushal";
//        String name2 = "kumar";
//        String name3 = name1 + " " +name2;
//        System.out.println(name3);
        //charAt
//       String name ="kaushal";
//        System.out.println(name.charAt(3));

        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber =(int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("Waoh..Correct Number");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your Number is too large");
            }
            else {
                System.out.println("Your number is too small");
            }

        } while(userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(myNumber);

    }
}
