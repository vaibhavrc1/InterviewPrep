package java8features.lambda;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        DemoInterface demoInterface = (x)-> System.out.println("hello "+ x + "!");

        demoInterface.sayHello("vaibhav");
    }
}
