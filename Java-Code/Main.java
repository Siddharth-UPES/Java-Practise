//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Welcome to multiplication of table :");
//        System.out.print("Enter the number for table : ");
//        int num=sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(num+" x "+i+" = "+(num*i));
//        }
//    }
//}

//import java.util.Scanner;
//
//class SumOdd {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            int odd = 2 * i - 1;  // ith odd number
//            sum += odd;
//        }
//
//        System.out.println("Sum of first " + n + " odd numbers = " + sum);
//    }
//}

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the number for the factorial : ");
        int num=sc.nextInt();
        long faactorial_no=faactorial(num);
        System.out.println("The factorial of number is : "+faactorial_no);
    }
    public static long faactorial(int num){
        if(num<2) {
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
