package multithreading.runnableinterface;

public class Main {
    public static void main(String[] args) {
        RunnableInterfaceDemo runnableInterfaceDemo = new RunnableInterfaceDemo();
        Thread thread1 = new Thread(runnableInterfaceDemo);
        Thread thread2 = new Thread(runnableInterfaceDemo);
        Thread thread3 = new Thread(runnableInterfaceDemo);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
