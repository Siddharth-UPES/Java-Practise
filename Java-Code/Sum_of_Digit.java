import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for sum : ");
        int num=sc.nextInt();
        int sum_of_Digit=digit(num);
        System.out.println("Sum of Digit "+ sum_of_Digit);

    }
    public static int digit(int num){
        int num1=0;
        while(num>0){
            num1=num1+(num%10);
            num=num/10;
        }
        return num1;
    }
}
