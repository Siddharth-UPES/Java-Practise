import java.util.Scanner;
class Leap_Year {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Checking Leap year\n");
        System.out.print("Enter the year: ");
        int year=s.nextInt();

        if (year%400==0 ||(year%4 ==0 && year%100 !=0))
            System.out.println("This is leap year "+year);
        else {
            System.out.println("This is not a leap year "+year);
        }
    }
}
