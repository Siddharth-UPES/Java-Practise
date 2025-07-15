import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing number ODD_EVEN:\n");
        System.out.print("Enter the number:");
        int num=s.nextInt();
        Odd_Even(num);
    }
    public static int Odd_Even(int num){
        if(num %2==0){
            System.out.println("This is Even Number");
        }
        else {
            System.out.println("This is Odd number:");
        }
        return num;
    }
}
