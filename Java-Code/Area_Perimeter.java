import java.util.Scanner;

public class Area_Perimeter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Performing Square and Rectangle Calculation: \n");
        System.out.print("Enter the length of Rectangle : ");
        int num1=s.nextInt();
        System.out.print("Enter the Breadth of Rectangle : ");
        int num2=s.nextInt();

        int rectangle1=Rectangle1(num1,num2);
        System.out.println("The Rectangle Perimeter: "+rectangle1+"cm");
        int rectangle2=Rectangle2(num1,num2);
        System.out.println("The Rectangle Area: "+rectangle2+"cm\n");

        System.out.println("Enter the side of the Square:");
        int num3=s.nextInt();
        int square1=Square1(num1);
        System.out.println("The Square Area: "+square1+"cm");
        int square2=Square2(num1);
        System.out.println("The Square Perimeter: "+square2+"cm\n");


        System.out.print("Enter the base of triangle: ");
        double base=s.nextInt();
        System.out.println("enter the height of triangle: ");
        double height=s.nextInt();
        double tri=Triangle(base,height);
        System.out.println("The area of triangle: "+tri);

    }
    public static int Rectangle1(int length,int breadth){
        int Peri=2*(length+breadth);
       return Peri;
    }
    public static int Rectangle2(int length,int breadth){
        int Area=length * breadth;
        return Area;
    }
    public static int Square1(int length){
        int Area=length*length;
        return Area;
    }
    public static int Square2(int length){
        int Peri=length * 4;
        return Peri;
    }
    public static double Triangle(double base,double height){
        double Area=1/2*(base*height);
        return Area;
    }
}
