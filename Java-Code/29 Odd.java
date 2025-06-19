//import java.util.Scanner;
//class Odd {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Only odd number will add to n\n");
//        System.out.println("Please enter your number: ");
//        int num=s.nextInt();
//        int sum=OddnumberSum(num);
//        System.out.println("OddSum"+num+ "is"+sum);
//    }
//    public static int OddnumberSum(int num){
//    int sum=0;
//    int i=1;
//    while(i<=num){
//        sum +=i;
//        i+=2;
//    }
//    return sum;

import java.util.Scanner;
class Odd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Showing Odd sum only");
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int oddSum =0;
        int i=1;
        while(i<=num){
            oddSum +=i;
            i+=2;
        }
        System.out.println("OddSum "+num+" is "+oddSum);
    }
}