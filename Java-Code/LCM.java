import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2=sc.nextInt();
        int lcm=LCM(num1,num2);
        System.out.println("LCM of these numbers are : "+lcm);

    }
    public static int LCM(int first,int second){
        int i=1;
        while(true){
            int factor=first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
    }
}
