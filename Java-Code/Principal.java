import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing the Simple Interest of Amount:");
        System.out.print("Enter the Princlpal : ");
        double p=s.nextDouble();
        System.out.print("Enter the Time: ");
        float t=s.nextFloat();
        System.out.print("Enter the Rate : ");
        float r=s.nextFloat();

        double si=SI(p,t,r);
        System.out.print("Your SI value is : "+si+"\n");

        double ci=CI(p,r,t);
        System.out.println("Your CI value is: "+ci);
    }

    public static double SI(double p,float t,float r){
        double SI=(p*r*t)/100;
        return SI;
    }
    public static double CI(double p,float t,float r){
//        double CI=p*(1+r/100*t);
        double CI=p*Math.pow((1+r/100),t);
        return  CI;
    }
}
