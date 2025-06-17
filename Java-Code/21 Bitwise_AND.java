import java.util.Scanner;

class Bitwise_AND {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showcasing Bitwise And Operator\n");
        System.out.println("enter first number:");
        int first=s.nextInt();
        System.out.println("enter second number:");
        int second=s.nextInt();

        int result=first & second;
        System.out.println("result is :"+ result);
    }
}
