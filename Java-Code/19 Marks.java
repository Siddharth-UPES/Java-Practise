import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Its time to check your grade");
        System.out.print("Enter your marks in percentage out of 100:");
        int marks=s.nextInt();

        if (marks>=90) {
            System.out.println("You got A grade");
        }
        else if (marks<90 && marks>=75) {
            System.out.println("you got B grade");
        }
        else if (marks<75 && marks>=60) {
            System.out.println("You got C grade");
        }
        else if (marks<60 && marks>=30) {
            System.out.println("You got D grade");
        }
        else
            System.out.println("You are Fail");
    }
}
