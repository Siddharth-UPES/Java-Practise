import java.util.Scanner;

public class Greatest_Of_Three {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing greatest of three:\n");
        System.out.println("Enter the number :");
        int num1=s.nextInt();
        System.out.println("Enter the number :");
        int num2=s.nextInt();
        System.out.println("Enter the number :");
        int num3=s.nextInt();
        Greatest_Of_Three(num1,num2,num3);
    }
    public static int Greatest_Of_Three(int num1,int num2,int num3 ){
        if(num1>num2 && num1>num3){
            System.out.println("Num 1  is greater: "+num1);
            return num1;
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is greater: "+num2);
            return num2;
        }
        else System.out.println("num3 is grater:"+num3);
        return num3;
    }
}
