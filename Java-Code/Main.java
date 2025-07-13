import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("WE are performing the sum");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number");
        int Number=input.nextInt();
        System.out.print("Enter the second number");
        int Second_Number=input.nextInt();
        int sum=Number+Second_Number;
        System.out.println("Sum of two number is :"+sum);

    }
}