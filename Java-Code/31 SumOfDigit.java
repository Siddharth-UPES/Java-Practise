import javax.sound.midi.SysexMessage;
import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing sum of Digit of integer:");
        int num=s.nextInt();
        int sum=SumOfDigit(num);
        System.out.println("Sum of Digit is: "+ sum);
    }
    public static int SumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum =sum+(num %10);
            num /=10;
        }
        return sum;
    }
}
