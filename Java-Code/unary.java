import java.util.Scanner;

public class unary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Usage of Unary Operator: ");
//
//        int x=10;
//        int y=-x;
//
//        System.out.println("Values are: "+ y);

        int a=5;
        a++;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        System.out.println("Decrement Operator");
        int b=9;
        System.out.println(b--);
        System.out.println(--b);
    }
}
