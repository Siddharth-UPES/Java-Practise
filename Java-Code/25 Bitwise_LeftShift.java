import java.util.Scanner;

class Bitwise_LeftShift {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Bitwise Left shift");
        System.out.println("Enter the number:");
        int num=s.nextInt();

        int result=num<<1;
        System.out.println("Result:"+result);
    }
}
