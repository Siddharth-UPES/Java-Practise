import java.util.Scanner;

class Simple_Interest {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Princpal : ");
        double Princpal=s.nextDouble();
        System.out.println("Enter the Time: ");
        double Time=s.nextDouble();
        System.out.println("Enter the Rate: ");
        double Rate=s.nextDouble();

        double SI=(Princpal*Time*Rate)/100;
        System.out.println("SI ="+SI);
    }
}
