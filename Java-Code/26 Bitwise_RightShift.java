import java.util.Scanner;
class Bitwise_RightShift {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);

            System.out.println("Bitwise Right shift");
            System.out.print("Enter the number:");
            int num=s.nextInt();

            int result=num>>1;
            System.out.println("Result:"+result);
        }
    }