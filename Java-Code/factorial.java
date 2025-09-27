import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the number : ");
        int num=sc.nextInt();
        long factor=factorial(num);
        System.out.println("the factorial for the "+ num +" is "+factor);
    }
    public static long factorial(int number){
        System.out.println("Function called for "+number);
        if (number==1){
            return 1;
        }
        return number*factorial(number-1);
    }
}
