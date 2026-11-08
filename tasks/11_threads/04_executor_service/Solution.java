import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        List<Future<Long>> futures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            final int value = sc.nextInt();
            futures.add(pool.submit(new Callable<Long>() {
                @Override
                public Long call() {
                    return (long) value * value;
                }
            }));
        }
        long sum = 0;
        for (Future<Long> future : futures) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        pool.shutdown();
        System.out.println(sum);
    }
}
