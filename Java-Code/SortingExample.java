import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                return a1 - a2;
            }
        });
        System.out.println("Sorted in Ascending Order: " + numbers);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                return a2 - a1;
            }
        });
        System.out.println("Sorted in Descending Order: " + numbers);
    }
}


