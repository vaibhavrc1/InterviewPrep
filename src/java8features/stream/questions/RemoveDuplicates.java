package java8features.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumber = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumber);
    }
}
