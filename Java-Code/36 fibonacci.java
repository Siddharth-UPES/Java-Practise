import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Show the Fibonacci series of the number");
        System.out.println("Enter the number");
        int num=s.nextInt();
        System.out.println("The fibonacci series of the number is: ");
        Fibonacci_Series(num);

    }public static void Fibonacci_Series(int num){
        if (num<0) return;
        System.out.println("0 ");
        if (num==0) return;
        System.out.println("1 ");

        int first=0,second=1;
        while(first+second<=num){
            int third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;
        }



    }
}
