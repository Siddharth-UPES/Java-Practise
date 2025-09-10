import java.util.Scanner;

class Revision21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bitwise AND \n");
        System.out.print("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2=sc.nextInt();

        int result1 =num1 & num2;
        int result2 =num1 | num2;
        int result3=num1 ^ num2;
        int result4=~num1;
        int result7=~num2;
        int result5=num1>>num2;
        int result6=num1<<num2;



        System.out.println("The result of Bitwise AND is : "+result1);
        System.out.println("The result of Bitwise OR is : "+result2);
        System.out.println("The result of Bitwise XOR is : "+result3);
        System.out.println("The result of Bitwise COMPLIMENT is : "+result4);
        System.out.println("The result of Bitwise COMPLIMENT is : "+result7);
        System.out.println("The result of Bitwise RIGHT SHIFT is : "+result5);
        System.out.println("The result of Bitwise LEFT SHIFT is : "+result6);

    }
}
