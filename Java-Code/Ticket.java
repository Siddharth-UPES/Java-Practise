import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount calculator");
        System.out.println("Enter your age: ");
        int age=s.nextInt();
        System.out.println("Are you female? (true/false)");
        boolean isFemale=s.nextBoolean();

        if(age<5)
        {
            System.out.println("you got 75% discount");
        }
        else if (isFemale){
            System.out.println("you got 50% discount");
        }
        else if(age>60 && !isFemale)
        {
            System.out.println("You got 25% discount");
        }
        else {
            System.out.println("You got no discount");
        }
    }
}
