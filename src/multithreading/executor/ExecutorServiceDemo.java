package multithreading.executor;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;


public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<Integer> c1 = ()-> 2+2;
        Callable<Integer> c2 = ()-> 2+3;
        List<Future<Integer>> futures = executorService.invokeAll(List.of(c1, c2));
        for(Future<Integer> future:futures){
            System.out.println(future.get()); // 3. 5
        }

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        Runnable r3 = ()-> System.out.println(12+2);
        Callable<Integer> c4 = ()-> 2+3;
        ScheduledFuture scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(r3, 1, 1, TimeUnit.SECONDS);
        System.out.println(scheduledFuture.get()); //14 14 14 ....
    }
}
