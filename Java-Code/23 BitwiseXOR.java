import java.util.Arrays;
import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Bitwise XOR");
        System.out.print("enter the first number :");
        int first=s.nextInt();
        System.out.print("Enter the second number :");
        int second=s.nextInt();

        int result=first ^ second;
        System.out.println("result :"+result);
    }
}
