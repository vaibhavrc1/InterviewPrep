package java8features.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("sam");
        stringJoiner.add("josh");
        System.out.println(stringJoiner);

        String[] names = new String[]{"Sam", "Josh"};
        System.out.println(String.join(",", names));
        System.out.println(String.join(",", Arrays.asList(names)));
    }
}
