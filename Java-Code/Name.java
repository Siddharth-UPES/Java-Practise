import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Plaese enter your name: ");
        String name=input.nextLine();
        System.out.println("Good Morning "+name);
        System.out.println(name+", ALso tell your age");
        int age=input.nextInt();
        System.out.println("Your age is:"+age);
    }
}