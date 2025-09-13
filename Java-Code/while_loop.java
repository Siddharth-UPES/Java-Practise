//import java.util.Scanner;
//
//public class while_loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your number : ");
//        int num = sc.nextInt();
//        while (num <= 100) {
//            System.out.println(num);
//            num++;
//        }
//    }
//}
//


import java.util.Scanner;

class while_loop{
    public static void main(String[] args) {
//        int count=500;
//        while(count>=200){
//            System.out.println(count);
//            count--;
//        }
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<5){
            int input=sc.nextInt();
            System.out.println(input);
            i++;
        }
    }
}