import java.util.Scanner;

class Armstrong
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing Armstrong number\n");
        System.out.println("Enter the number: ");
        int num=s.nextInt();
       boolean Armstrong= isArmstrong(num);
       if (Armstrong)
           System.out.println("Your number is Armstrong ");
       else
           System.out.println("Your numbeer is not Armstrong: ");
    }

    public static boolean isArmstrong(int num)
    {
        int numberOfDigit=numberOfDigit(num);
        int numCopy=num;
        int finalNumber=0;
        while (num>0)
        {
            int lastdigit=num%10;
            num /=10;
            finalNumber +=power(lastdigit,numberOfDigit);
        }
        System.out.println("Show number: "+numCopy);
        return finalNumber==numCopy; 
    }

    public static int power(int num1,int num2)
    {
        int result =1;
        int i=0;
        while (i<num2)
        {
            result *=num1;
            i++;
        }
        return result;
    }

    public static int numberOfDigit(int num)
    {
        int digit = 0;
        while (num > 0)
        {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
