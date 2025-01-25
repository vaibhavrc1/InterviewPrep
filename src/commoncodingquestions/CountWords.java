package commoncodingquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountWords {
    //Write a Java program to count the number of words in a given sentence.
    public static void main(String[] args) {
        String sentence = " This is    a sample sentence to count words !";
        System.out.println(countWords(sentence));
    }

    public static long countWords(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return 0;
        }
        String[] words = sentence.split(" ");
        long count = Arrays.asList(words)
                .stream()
                .filter(word -> !word.trim().isEmpty() && word.chars().allMatch(Character::isLetter))
                .count();
        return count;
    }
}
