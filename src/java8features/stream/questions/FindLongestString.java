package java8features.stream.questions;

import java.util.Arrays;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange",
                "grape", "kiwi");
        String longestString = strings.stream().max((s1, s2)-> s1.length() - s2.length()).get();
        System.out.println(longestString);
    }
}
