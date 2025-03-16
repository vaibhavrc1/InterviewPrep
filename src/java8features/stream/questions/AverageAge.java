package java8features.stream.questions;

import java.util.List;

public class AverageAge {
    public static void main(String[] args) {
        List<Integer> list = List.of(20, 25, 30, 35);
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
    }
}
