package multithreading.threadclass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadClassDemo t1 = new ThreadClassDemo();
        ThreadClassDemo t2 = new ThreadClassDemo();
        ThreadClassDemo t3 = new ThreadClassDemo();

        t1.start();
        t2.start();
        t3.start();
        System.out.println("done");
    }
}
