import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Perimeter of the rectangle ");

        System.out.println("Enter side1 of rectangle: ");
        double s1=sc.nextDouble();
        System.out.println("ENter side2 of rectangle: ");
        double s2=sc.nextDouble();
        System.out.println("Enter side3 of rectangle: ");
        double s3=sc.nextDouble();
        System.out.println("ENter side4 of rectangle: ");
        double s4=sc.nextDouble();

        System.out.println("Perimeter "+(s1+s2+s3+s4));


    }
}
