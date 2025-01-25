package multithreading.runnableinterface;

public class RunnableInterfaceDemo implements Runnable{

    @Override
    public void run(){
        System.out.println("Executing thread" + Thread.currentThread().getName());
    }
}
