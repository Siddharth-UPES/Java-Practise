import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing star Pattern" );
        System.out.print("Enter the number:");
        int num=s.nextInt();
        Pattern(num);
        System.out.println("\n");
        s.close();
    }
    public static void Pattern(int num){
        for (int i=1;i<=num;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
