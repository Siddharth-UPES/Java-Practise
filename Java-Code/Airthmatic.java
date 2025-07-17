import java.util.Scanner;

public class Airthmatic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Performing  the airthmatic operation : \n");
        System.out.print("Enter the 1st number: ");
        int num1=s.nextInt();
        System.out.print("enter the 2nd number: ");
        int num2=s.nextInt();
        AirthmaticOperation(num1,num2);


    }
    public static void AirthmaticOperation(int num1,int num2){
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int Div=num1/num2;
        int Mod=num1%num2;

        System.out.println("The Airthmatic operation of Add: "+add);
        System.out.println("The Airthmatic operation of sub: "+sub);
        System.out.println("The Airthmatic operation of mul: "+mul);
        System.out.println("The Airthmatic operation of Div: "+Div);
        System.out.println("The Airthmatic operation of Mod: "+Mod);
    }
}
