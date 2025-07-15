import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Changing temperature F to C: \n");
        System.out.println("Enter the temerature in fahrenheit: ");
        float f=s.nextFloat();

        float fah=Fahrenheit(f);
        System.out.println("Our temp is change into Celcius: "+fah);
    }
    public static float Fahrenheit(float f){
        float C=(f-32)*5/9;
        return C;
    }
}
