// Wyświetlenie liczb z ciągu Fibonacciego

public class FibonacciSequence2 {
    public static void main(String[] args) {
     showFibonacciNumbers(5);
    }

    public static void showFibonacciNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int number) {
        return number <= 2 ? 1 : fibonacci(number - 1) + fibonacci(number - 2);
    }
}