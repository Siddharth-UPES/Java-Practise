import java.util.Scanner;

class Odd_Even {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Check the number even or odd");

        System.out.println("Enter the number");
        int num=s.nextInt();

        if ((num%2)==0)
        System.out.println("The number is even");
        else
        System.out.println("The number is odd");

    }
}
