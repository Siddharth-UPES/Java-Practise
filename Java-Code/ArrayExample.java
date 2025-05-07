public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        numbers[2] = 10;
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Array elements (using for-each loop):");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
