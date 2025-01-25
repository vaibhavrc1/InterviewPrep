package java8features.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> names = List.of("jack", "tom", "sam", "tom");
        List<List<String>> nestedList = List.of(List.of("first", "second"), List.of("third", "fourth"));

        /* Intermediate Operations */
        //1.map:
        System.out.println(names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()));

        //2.filter:
        System.out.println(names.stream().filter(x -> x.length() <= 3).collect(Collectors.toList()));

        //3.flatmap:
        System.out.println(nestedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList()));

        //4.distinct:
        System.out.println(names.stream().distinct().collect(Collectors.toList()));

        //5.sorted (ascending):
        System.out.println(names.stream().sorted().collect(Collectors.toList()));

        //5.sorted (descending):
        System.out.println(names.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

        //6.limit:
        System.out.println(names.stream().limit(2).collect(Collectors.toList()));

        //7.skip: skips first n elements
        System.out.println(names.stream().skip(2).collect(Collectors.toList()));

        //8.peek: for checking intermediate results
        System.out.println(names.stream().skip(2).peek(x -> System.out.println("Peeking " + x)).collect(Collectors.toList()));

        /* Terminal Operations */
        //1.forEach:
        names.stream().forEach(System.out::println);

        //2.collect: (used above)

        //3.reduce: reduced number of elements to single value
        System.out.println(names.stream().reduce((a, b) -> a+b).get());

        //4.count:
        System.out.println(names.stream().count());

        //5.anyMatch:(short-circuit)
        System.out.println(names.stream().anyMatch(x->x.equals("sam")));

        //6.allMatch:(short-circuit)
        System.out.println(names.stream().allMatch(x->x.equals("sam")));

        //7.noneMatch: opposite of anyMatch(short-circuit)
        System.out.println(names.stream().allMatch(x->x.equals("sam")));

        //8.findFirst:(short-circuit)
        System.out.println(names.stream().findFirst().get());

        //9.findAny:(short-circuit)
        System.out.println(names.stream().findAny().get());

    }
}
