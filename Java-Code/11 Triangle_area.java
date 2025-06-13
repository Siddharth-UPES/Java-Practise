import java.util.Scanner;

class Triangle_area {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the height of Triangle");
        double height=s.nextDouble();
        System.out.println("Enter the base of triangle");
        double base=s.nextDouble();

        //double area=(double)1/2*height*base;
        double area=1.0/2*height*base;
        System.out.println("Area of triangle : " +area);
    }
}
