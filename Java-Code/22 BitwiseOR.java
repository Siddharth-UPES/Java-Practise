import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Bitwise OR operator \n");
        System.out.println("enter first number:");
        int first=s.nextInt();
        System.out.println("Enter second number:");
        int second=s.nextInt();

        int result=first | second;
        System.out.println("Result is:"+result);
    }
}
