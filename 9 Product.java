import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the first floating number");
        float first=s.nextFloat();
        System.out.println("Enter the second floating number");
        float second=s.nextFloat();

        float product=first*second;
        System.out.println("Product of two floating number:"+product);
    }
}
