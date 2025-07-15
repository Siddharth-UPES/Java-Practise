import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Performing Addition of the number");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1=s.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2=s.nextInt();
        int num=Sum(num1,num2);
        System.out.println("Sum of number is :"+num);

    }
    public static int Sum(int num1,int num2){
        int num=num1+num2;
        return num;
    }
}
