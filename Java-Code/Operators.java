import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Airthmatic Operators ");
        System.out.print("Enter the First Number: ");
        int a=sc.nextInt();

        System.out.print("Enter the second Number: ");
        int b=sc.nextInt();

        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Modulus "+(a%b));

    }
}
