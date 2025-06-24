import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Show palindrome data");
        System.out.print("Enter the number");
        int num=s.nextInt();
        boolean palindrome=isPalindrome(num);
        if (palindrome)
        System.out.println("This number is palindrome");
        else
        System.out.println("This number is not palindrome");

    }
    public static boolean isPalindrome(int num){
        return num==reverse(num);
    }
    public static int reverse(int num)
    {
        int newNumber = 0;
        while (num > 0)
        {
            int digit = num % 10;
            newNumber=newNumber*10+digit;
            num /= 10;
        }
        return newNumber;
    }

}
