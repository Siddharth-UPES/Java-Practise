import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.println("Please enter your age: ");
        int age=s.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible for drive");
        }
        else {
            System.out.println("You are not eligible to drive cycle only");
        }
    }
}
