import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Reverse the following Number\n");
        System.out.println("Enter the number");
        int num=s.nextInt();
        int reverseNum =reverse(num);
        System.out.println("Reverse of the following num is: "+reverseNum);

    }
    public static int reverse(int num){
        int newNumber=0;
        while(num>0){
            int digit=num%10;
            newNumber=newNumber*10+digit;
            //newNumber=newNumber*(num%10);
            num /=10;
        }
        return newNumber;
    }
}
