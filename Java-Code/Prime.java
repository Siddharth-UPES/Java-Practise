//import java.util.Scanner;
//public class Prime {
//    public static boolean isPrime(int num) {
//        if (num <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//    }
//    public static String toBinary(int num) {
//        StringBuilder binary = new StringBuilder();
//        while (num > 0) {
//            binary.insert(0, num % 2);
//            num /= 2;
//        }
//        return binary.toString();
//    }
//    public static String toOctal(int num) {
//        StringBuilder octal = new StringBuilder();
//        while (num > 0) {
//            octal.insert(0, num % 8);
//            num /= 8;
//        }
//        return octal.toString();
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        if (isPrime(number)) {
//            System.out.println("The number is prime.");
//            System.out.println("Binary representation: " + toBinary(number));
//        } else {
//            System.out.println("The number is not prime.");
//            System.out.println("Octal representation: " + toOctal(number));
//        }
//        scanner.close();
//    }
//}
//

class University {
    // Static Nested Class
    static class Faculty {
        void display() {
            System.out.println("Faculty data (Static Nested Class) does not depend on a University instance.");
        }
    }

    // Inner class (requires outer class instance) - NOT suitable
    class InnerFaculty {
        void display() {
            System.out.println("Inner class requires an instance of University.");
        }
    }
}

public class Prime {
    public static void main(String[] args) {
        // Static Nested Class works
        University.Faculty faculty = new University.Faculty();
        faculty.display();

        // Uncomment below to demonstrate error with Inner Class
        // University.InnerFaculty innerFaculty = new University().new InnerFaculty();
        // innerFaculty.display(); // Error: Requires outer class instance
    }
}
