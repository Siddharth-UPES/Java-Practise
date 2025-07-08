import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number:");
        int one=s.nextInt();
        System.out.println("Enter second number:");
        int two=s.nextInt();
        System.out.println(sumTwoNumber(one,two)+"\n");

//        int num=sumTwoNumber(4,7);
//        System.out.println(num);
//
//        System.out.println(sumTwoNumber(7,9));

    }
    public static int sumTwoNumber(int first,int second){
        System.out.println("First Number recived: "+first);
        System.out.println("Second number recived: "+second);
        int sum=first+second;
        return  sum;
    }
}
