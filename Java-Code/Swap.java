import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sawpping of the number");
        System.out.print("ENter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        int num3=num1;
        num1=num2;
        num2=num3;

        System.out.println("Swapping Done...");
        System.out.println("Our value of first number is: "+ num1 );
        System.out.print("Our value of first number is: "+ num2 );
    }
}
