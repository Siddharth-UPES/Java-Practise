import java.util.Scanner;

public class return1 {
    public static void main(String[] args) {
        greet();
        int first= readnumber();
        int second=readnumber();
        int sum=first+second;
        System.out.println("Sum of two number is : "+sum);
    }
    public static void greet(){
        System.out.println("Welcome to the basic calculator : ");
    }
    public static int readnumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number= sc.nextInt();
        return number;
    }
}
