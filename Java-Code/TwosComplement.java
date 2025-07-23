import java.util.Scanner;
public class TwosComplement {
    public static int findCeiling(double x) {
        int intPart = (int) x;
        if (x > intPart) {
            return intPart + 1;
        }
        return intPart;
    }
    public static String toTwosComplement(int num) {
        StringBuilder binary = new StringBuilder();
        if (num >= 0) {
            binary.append(Integer.toBinaryString(num));
        } else {
            binary.append(Integer.toBinaryString(num));
        }
        return binary.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double x = scanner.nextDouble();
        int y = findCeiling(x);
        System.out.println("Ceiling of " + x + " is: " + y);
        String twosComplement = toTwosComplement(y);
        System.out.println("2's complement of " + y + " is: " + twosComplement);
        scanner.close();
    }
}
