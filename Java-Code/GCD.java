import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2=sc.nextInt();
        int Greatest_Common_Factor=gcd(num1,num2);
        System.out.println("GCD of thse number are : "+Greatest_Common_Factor);

    }
    public static int gcd(int first,int second){
        int b=1;
        int i=2;
        int least1=least(first,second);
        while(i<=least1){
            if (first % i==0 && second % i==0){
                b=i;
            }
            i++;
        }
        return b;

    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
