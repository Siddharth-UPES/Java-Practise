//public  class Main {
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        System.out.println("Sum of two number: "+(a+b));
//    }
//}


//// for adding two number and user input
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a 1st number: ");
//        int num1=sc.nextInt();
//        System.out.print("Enter a 2nd number: ");
//        int num2=sc.nextInt();
//        int num3=num1+num2;
//        System.out.println("The sum of two number is: "+num3);
//    }
//
//}


//// program to swap two number
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("the two number is:");
//        int a=10;
//        int b=5;
//        System.out.println("value of a: "+a);
//        System.out.println("value of b: "+b);
//        System.out.println("after swapping the number is: ");
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("value of a: "+a);
//        System.out.println("value of b: "+b);
//
//    };
//}

//// user input
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the 1st number : ");
//        int num1=sc.nextInt();
//        System.out.print("Enter the 2nd number: ");
//        int num2=sc.nextInt();
//        System.out.println("Before swapping the number:" );
//        System.out.println("num1 value is:"+(num1) +"\n" +"num2 value is"+(num2)+"\n");
//        int temp=num1;
//        num1=num2;
//        num2=temp;
//        System.out.println("After swapping the number: ");
//        System.out.println("num1 value is:"+(num1) +"\n" +"num2 value is"+(num2));
//    }
//}

// airthmatic operation
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the two number ");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        System.out.println("Airthmetic operations:");
//        int sum=num1+num2;
//        int sub=num1-num2;
//        int mul=num1*num2;
//        int div=num1/num2;
//        System.out.println("Addition: "+sum);
//        System.out.println("subtraction: "+sub);
//        System.out.println("Division: "+div);
//        System.out.println("Multiplication: "+mul);
//
//    }
//}

//// calculate area,perimeter
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of rectangle:");
//        float length=sc.nextFloat();
//        System.out.println("Enter the breadth of rectangle");
//        float breadth=sc.nextFloat();
//        //float peri=sc.nextFloat();
//      //  float area=sc.nextFloat();
//        float peri=2*(length+breadth);
//        float area=length*breadth;
//        System.out.println("Area"+area);
//        System.out.println("Peri"+peri);
//
//    }
//}


//
//class ThreadA extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Thread A is running.");
//    }
//}
//class ThreadB extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Thread B is running.");
//    }
//}
//class ThreadC implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Thread C is running.");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        ThreadA threadA = new ThreadA();
//        ThreadB threadB = new ThreadB();
//        Thread threadC = new Thread(new ThreadC());
//        threadA.start();
//        threadB.start();
//        threadC.start();
//    }
//}


class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("Thread A is running.");
        for (int i = 0; i < 5; i++) {
            System.out.println("From Thread A "+i);
        }
    }
}
class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("Thread B is running.");
        for (int i = 0; i < 5; i++) {
            System.out.println("From Thread B "+i);
        }
    }
}
class ThreadC implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread C is running.");
        for (int i = 0; i < 5; i++) {
            System.out.println("From Thread C "+i);
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[3];
        threads[0] = new ThreadA();
        threads[1] = new ThreadB();
        threads[2] = new Thread(new ThreadC());
        for (int i = 0; i < threads.length; i++) {
            threads[i].start(); threads[i].join();
        }
    }
}
