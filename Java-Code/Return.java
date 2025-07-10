import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
       greet();

        int first=readNumber();
        int second=readNumber();

        int result=first+second;
        System.out.println("The sum of two number : " +result);
    }

    public static int readNumber()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int first=s.nextInt();
        return first;
    }

    public static void greet(){
        System.out.println("Add two number");
    }

}
