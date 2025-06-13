package chapter1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fib5 {

    private int last = 0, next = 1;

    public IntStream stream() {
        return IntStream.generate(() -> {
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;
        });
    }

    public static void main(String[] args) {
        Fib5 fib5 = new Fib5();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Bis zu welcher Zahl soll Fibonacci ausgegeben werden: "
        );
        int fibCount = scanner.nextInt();
        fib5.stream().limit(fibCount).forEach(System.out::println);
    }
}
