package java8features.stream.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 100;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            numbers.add(i);
        }
        List<Integer> primes = numbers.stream().filter(PrimeNumber::isPrimeNumber).collect(Collectors.toList());
        System.out.println(primes);
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
