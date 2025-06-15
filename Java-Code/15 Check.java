import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Checking the number");
        System.out.println("Enter the number: ");
        int num=s.nextInt();

        if (num<0)
            System.out.println("Print the number is -ve");
        else if (num>0) {
            System.out.println("The number is +ve");
        }
        else
            System.out.println("The number is 0");
    }
}
