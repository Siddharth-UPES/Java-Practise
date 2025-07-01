import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class FileIntegerOperations {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        System.out.println("Step 1: Writing 100 random integers to 'input.txt'...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))) {
            for (int i = 0; i < 100; i++) writer.write((random.nextInt(1000) + 1) + "\n");
        }
        System.out.println("Step 1 completed: 'input.txt' created with random integers.\n");
        System.out.println("Step 2: Reading integers from 'input.txt'...");
        List<Integer> integers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            reader.lines().map(Integer::parseInt).forEach(integers::add);
        }
        System.out.println("Step 2 completed: Read " + integers.size() + " integers.\n");
        System.out.println("Step 3: Sorting integers and calculating sum and product...");
        Collections.sort(integers);
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        BigInteger product = integers.stream().map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("Step 3 completed: Sorted, sum calculated as " + sum + ", product calculated.\n");
        System.out.println("Step 4: Writing results to 'output.txt'...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Sorted List: " + integers + "\n");
            writer.write("Sum: " + sum + "\n");
            writer.write("Product: " + product + "\n");
        }
        System.out.println("Step 4 completed: Results written to 'output.txt'.\n");
        System.out.println("All steps completed successfully!");
    }
}
