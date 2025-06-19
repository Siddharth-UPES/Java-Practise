import java.util.Scanner;
class OddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Odd Even Check by using bitwise");
        System.out.print("Enter the number:");
        int num=s.nextInt();

       if ((num & 1)==1)
        System.out.println("Your number is odd");
       else
           System.out.println("Your number is even");
    }
}
