import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Performing number program:\n ");
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        Number(num);

    }
    public static int Number(int num){
        if(num>0){
            System.out.println("This is positive number: ");
        } else if (num<0) {
            System.out.println("THis is negative number: ");
        }else {
            System.out.println("number is Zero:");
        }

        return num;
    }
}
