package java8features.stream.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestStream {

    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        String longestString = strings.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString);
    }
}
