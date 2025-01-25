package java8features.lambda;

import java.util.function.*;

public class InbuiltInterfaces {
    public static void main(String[] args) {
        // Function interface: Accepts 1, returns 1. Method: apply(obj);
        Function<Integer, Integer> squareFunction = (a)-> a*a;
        System.out.println(squareFunction.apply(5));

        // Bi-Function interface: Accepts 2, returns 1. Method: apply(obj1, obj2);
        BiFunction<Integer, Integer, Integer> addFunction = (a, b)-> a+b;
        System.out.println(addFunction.apply(5, 3));

        // Consumer interface: Accepts 1, returns 0. Method: accept(obj);
        Consumer<Integer> squarePrintFunction = a -> System.out.println(a*a);
        squarePrintFunction.accept(2);

        // BiConsumer interface: Accepts 2, returns 0. Method: accept(obj1, obj2);
        BiConsumer<Integer, Integer> addPrintFunction = (a, b) -> System.out.println(a+b);
        addPrintFunction.accept(3, 4);

        // Supplier interface: Accepts 0, returns 1. Method: get();
        Supplier<String> helloFunction = () -> "hello";
        System.out.println(helloFunction.get());

        // Predicate interface: Accepts 1, returns 1. Method: test(Obj obj);
        Predicate<String> isEmptyFunction = a -> a.isEmpty();
        System.out.println(isEmptyFunction.test("Hello"));
        System.out.println(isEmptyFunction.test(""));

        // Bi-Predicate interface: Accepts 2, returns 1. Method: test(Obj obj1, Obj obj2);
        BiPredicate<String, String> isConcatEmptyFunction = (a, b) -> (a+b).isEmpty();
        System.out.println(isConcatEmptyFunction.test("Hello", ""));
        System.out.println(isConcatEmptyFunction.test("",""));
    }
}
