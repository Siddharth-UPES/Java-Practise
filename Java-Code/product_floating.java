import java.util.Scanner;
public class product_floating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Floating Product of number");
        System.out.println("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2=sc.nextDouble();

        System.out.println("Product "+(num1*num2));
    }
}
