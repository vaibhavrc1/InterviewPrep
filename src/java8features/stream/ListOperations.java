package java8features.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(9, 2, 3, 4, 2, 2, 9 ,4, 9);

        // get distinct elements
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

        // reverse list
        Collections.reverse(list);
        System.out.println(list);

        // descending order
        Collections.sort(list, (a, b)-> b-a); //1
        Collections.sort(list, Collections.reverseOrder());  //2
        System.out.println(list);

        // Synchronize list
        list = Collections.synchronizedList(list);
    }
}
