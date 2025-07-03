import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

public class Multithreaded {
    private static final String INPUT_FILE = "numbers.txt";
    private static final String OUTPUT_FILE = "results.txt";
    public static void main(String[] args) throws Exception {
        System.out.println("\nStep 1: Writing 100 random integers to '" + INPUT_FILE + "'...");
        generateFile();
        System.out.println("Step 1 completed.\n");
        System.out.println("Step 2: Reading integers from '" + INPUT_FILE + "'...");
        List<Integer> numbers = readFromFile();
        System.out.println("Step 2 completed: Read " + numbers.size() + " integers.\n");
        System.out.println("Step 3: Sorting integers, calculating sum and product...");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<List<Integer>> sortedFuture = executor.submit(() -> {
            List<Integer> sortedList = new ArrayList<>(numbers);
            Collections.sort(sortedList);
            return sortedList;
        });
        Future<Integer> sumFuture = executor.submit(() -> numbers.stream().mapToInt(Integer::intValue).sum());
        Future<BigInteger> productFuture = executor.submit(() -> {
            BigInteger product = BigInteger.ONE;
            for (int num : numbers) {
                product = product.multiply(BigInteger.valueOf(num));
                if (product.equals(BigInteger.ZERO)) break;
            }
            return product;
        });
        List<Integer> sortedList = sortedFuture.get();
        int sum = sumFuture.get();
        BigInteger product = productFuture.get();
        executor.shutdown();
        System.out.println("Step 3 completed: Sorted, sum = " + sum + ", product calculated.\n");
        System.out.println("Step 4: Writing results to '" + OUTPUT_FILE + "'...");
        writeToFile(sortedList, sum, product);
        System.out.println("Step 4 completed.\nAll steps completed successfully!");
    }
    private static void generateFile() throws IOException {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE))) {
            for (int i = 0; i < 100; i++) {
                writer.write(random.nextInt(100) + 1 + "\n");
            }
        }
    }
    private static List<Integer> readFromFile() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        }
        return numbers;
    }
    private static void writeToFile(List<Integer> sortedList, int sum, BigInteger product) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            writer.write("Sorted List: " + sortedList + "\nSum: " + sum + "\nProduct: " + product + "\n");
        }
    }
}
