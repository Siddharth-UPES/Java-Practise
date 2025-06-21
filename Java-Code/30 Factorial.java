import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing the calcuation of factorial\n");
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        long fact=factoial_Number(num);
        System.out.println("Factorial is"+fact);


    }
    public static long factoial_Number(int num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact *=i;
            i++;
        }
           return fact;
    }
}
