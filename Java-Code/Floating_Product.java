import java.util.Scanner;

public class Floating_Product {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing float Product");
        System.out.println("Enter the 1st number: ");
        float num1=s.nextFloat();
        System.out.println("Enter the 2nd number: ");
        float num2=s.nextFloat();
        float pro=FloatProduct(num1,num2);
        System.out.println("The float product is: "+pro);
    }

    public static float FloatProduct(float num1,float num2) {
        float num3 = num1 * num2;

        return num3;
    }
}
