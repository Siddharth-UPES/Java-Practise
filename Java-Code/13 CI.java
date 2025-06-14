import java.util.Scanner;

class CI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Princpal : ");
        double Princpal=s.nextDouble();
        System.out.println("Enter the Time: ");
        double Time=s.nextDouble();
        System.out.println("Enter the Rate: ");
        double Rate=s.nextDouble();

      double ci=Princpal* Math.pow((1+Rate/100),Time);
        //double ci=Princpal*(1+Rate/100*Time);
        System.out.println("Compound intrest: "+ci);
    }

}
