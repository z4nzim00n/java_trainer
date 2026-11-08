import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Пул из двух рабочих потоков; задачи выполняются по очереди.
        ExecutorService pool = Executors.newFixedThreadPool(2);
        List<Future<Long>> futures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // value должен быть final для анонимного класса.
            final int value = sc.nextInt();
            futures.add(pool.submit(new Callable<Long>() {
                @Override
                public Long call() {
                    // (long) до умножения защищает от переполнения int.
                    return (long) value * value;
                }
            }));
        }
        long sum = 0;
        // Future.get() блокируется до готовности результата.
        // Порядок списка совпадает с порядком отправки задач.
        for (Future<Long> future : futures) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                // Ошибка внутри задачи.
                e.printStackTrace();
            }
        }
        // Без shutdown() рабочие потоки могут не дать JVM завершиться.
        pool.shutdown();
        System.out.println(sum);
    }
}
