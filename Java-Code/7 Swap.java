import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping the number\n\n");
        System.out.println("Enter value of A: ");
        int a=input.nextInt();
        System.out.println("Enter value of B :");
        int b=input.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println("Swaping Done");
        System.out.println("Value of a is:"+a);
        System.out.println("Value of b is:"+b);
    }
}


// simple swap program
//class Swap{
//    public static void main(String[] args) {
//        int a =10;
//        int b=5;
//        int c=15;
//        int d=20;
//        int e=a;
//        a=b;
//        b=c;
//        c=d;
//        d=e;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("c="+c);
//        System.out.println("d="+d);
//
//    }
//}