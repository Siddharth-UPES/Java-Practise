import java.util.Scanner;

class Gratest_of_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Check the Greatest of 3 ");
        System.out.print("Enter the number1 before checking:");
        int num1=s.nextInt();
        System.out.print("Enter the number2 before checking:");
        int num2=s.nextInt();
        System.out.print("Enter the number3 before checking:");
        int num3=s.nextInt();

        if (num1>=num2 && num1>=num3)
            System.out.println("The greatest number is :"+num1);
        else if (num2>=num1 && num2>=num3) {
            System.out.println("The greatest numer is :" +num2);
        }
        else
            System.out.println("The greatest number is:"+num3);

    }
}
