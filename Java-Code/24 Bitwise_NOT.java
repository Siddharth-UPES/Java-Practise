import java.util.Scanner;

class Bitwise_NOT {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Bitwise NOT");
        System.out.println("Please enter the number: ");
        int num =s.nextInt();


        int result=~num;
        System.out.println("Result"+result);

    }
}
