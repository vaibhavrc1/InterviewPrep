package java8features.methodreference;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        MethodReferenceDemo mrd = new MethodReferenceDemo();
        List<String> names = List.of("Sam", "Tom", "jack");
        List<String> names2 = names.stream().map(mrd::uppercase).collect(Collectors.toList());
        System.out.println(names2);
        String s = "Hello";
    }

    public String uppercase(String str){
        return str.toUpperCase();
    }
}
