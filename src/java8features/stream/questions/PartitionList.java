package java8features.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(x-> x%2 == 0));
        System.out.println("even:"+ map.get(true));
        System.out.println("odd:"+ map.get(false));
    }
}
