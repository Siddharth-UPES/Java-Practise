import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("HCF ");
        System.out.println("enter 1st number:");
        int first=s.nextInt();
        System.out.println("enter 2nd number");
        int second=s.nextInt();
        int gcd=gcd(first,second);
        System.out.println("Hcf of the number is:"+gcd);
    }
    public static int gcd(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);// this method is call
        while(i<=least){
            if(num1 % i==0 && num2 % i==0){
                gcd=i;
            }
            i++;
        }
        return  gcd;
    }
    public static int least(int num1,int num2){
        if (num1<num2){
            return num1;
        }
        else
            return num2;
    }
}
