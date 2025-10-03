import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number :");
        int num=sc.nextInt();
        boolean palindrome=isPalindrome(num);
        if (palindrome){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }

    }
    public static boolean isPalindrome(int num1){
        return (num1==reverse(num1));
    }
    public static int reverse(int num2){
        int newnumber =0;
        while(num2>0){
            int digit=num2%10;
            newnumber=newnumber*10+digit;
            num2=num2/10;
        }
        return newnumber;
    }

}
