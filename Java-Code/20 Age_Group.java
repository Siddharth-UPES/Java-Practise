import java.util.Scanner;

class Age_Group {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your age :");
        int age=s.nextInt();
        if (age>=65){
            System.out.println("Senior Citizen");
        }
        else if (age>=20) {
            System.out.println("Adult");
        }
        else if (age>=13) {
            System.out.println("Teen");
        }
        else
            System.out.println("Child");
    }
}
