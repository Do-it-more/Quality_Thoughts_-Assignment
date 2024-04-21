package Quality_Thoughts;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 6, 8, 9, 3, 5); 
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println("List after removing duplicates: " + uniqueNumbers); 
        List<Integer> evenNumbers = uniqueNumbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println("Even numbers after filtering: " + evenNumbers);     
        int sumOfEvenNumbers = evenNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}
