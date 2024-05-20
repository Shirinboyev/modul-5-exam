package main.java.uz.pdp.lesson3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 9, 2, 6);
        int threshold = 5;
        int result = sumOfSquaresThreshold(numbers, threshold);
        System.out.println("Berilgan threshold'dan yuqori bo'lgan sonlarning kvadratlari yig'indisi: " + result);
    }

    public static int sumOfSquaresThreshold(List<Integer> numbers, int threshold) {
        return numbers.parallelStream()
                .filter(n -> n > threshold)
                .mapToInt(n -> n * n)
                .sum();
    }
}
