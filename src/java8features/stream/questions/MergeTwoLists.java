package java8features.stream.questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {


    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,3,5,7);
        List<Integer> list2 = List.of(2, 4, 6, 8);
        List<Integer> sorted = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }

}
