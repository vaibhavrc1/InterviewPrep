package multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        CompletableFuture<Integer> completableFuture1 = completableFuture.completeAsync(() -> 2 + 5).thenApply((x)-> x * x);
        System.out.println(completableFuture1.get()); //7
    }
}
