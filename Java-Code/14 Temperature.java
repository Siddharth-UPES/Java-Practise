import java.sql.SQLOutput;
import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your temp in F :");
        float f=s.nextFloat();

        float c=(f-32)*5/9;
        System.out.println("temp in celsius :"+c);
    }
}
