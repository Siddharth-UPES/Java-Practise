import java.util.Scanner;

class Rectangle_Perimeter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length=s.nextDouble();
        System.out.println("Enter the Breadth of the rectangle");
        double breadth=s.nextDouble();

        double peri=((length+breadth)*2);
        System.out.println("Perimeter of two rectangle:"+ peri);
    }
}
