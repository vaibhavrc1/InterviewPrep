package java8features.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> names = List.of("jack", "tom", "sam", "tom");
        List<Integer> numbers = List.of(5, 2, 3, 4);
        int[] arrayNumbers = new int[]{2,3,6,3};
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
        System.out.println((long) names.stream().count());

        //5.anyMatch:(short-circuit)
        System.out.println(names.stream().anyMatch(x->x.equals("sam")));

        //6.allMatch:(short-circuit)
        System.out.println(names.stream().allMatch(x->x.equals("sam")));

        //7.noneMatch: opposite of anyMatch(short-circuit)
        System.out.println(names.stream().noneMatch(x->x.equals("sam")));

        //8.findFirst:(short-circuit)
        System.out.println(names.stream().findFirst().get());

        //9.findAny:(short-circuit)
        System.out.println(names.stream().findAny().get());

        //10.min
        System.out.println(numbers.stream().max(Integer::compare).get());

        //11.max
        System.out.println(numbers.stream().min(Integer::compare).get());

        //11.sum: IntStream
        System.out.println(Arrays.stream(arrayNumbers).sum());

        int[] a = { 10 , 20 , 30 , 40 };
        int[] b = { 5 , 60 , 7 , 20 };

        System.out.println(Arrays.toString(IntStream.concat(IntStream.of(a), IntStream.of(b)).sorted().distinct().toArray()));

        String testing = "hello";
        char chtesting = testing.chars().mapToObj(ch-> (char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(chtesting);
    }
}
