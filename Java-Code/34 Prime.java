import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing Prime numbwer");
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        boolean prime=Prime(num);
        if(prime){
            System.out.println("your number is prime:");
        }
        else {
            System.out.println("Your is number is not prime: ");
        }


    }
    public static boolean Prime(int num){
        int i=2;
        while (i<num){
            if (num% i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
