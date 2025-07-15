import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1=s.nextInt();
        System.out.println("enter the second number: ");
        int num2=s.nextInt();

         int num3=num1;
         num1=num2;
         num2=num3;
        System.out.println("Swapping Done");
        System.out.println("the value of num1: "+num1);
        System.out.println("the value of num2: "+num2);
    }
}
