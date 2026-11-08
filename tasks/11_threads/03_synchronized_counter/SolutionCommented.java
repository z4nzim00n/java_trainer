import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int k = sc.nextInt();
        // Один объект счётчика, разделяемый двумя потоками.
        final Counter counter = new Counter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < k; i++) {
                    counter.increment();
                }
            }
        };
        Thread first = new Thread(task);
        Thread second = new Thread(task);
        first.start();
        second.start();
        try {
            // После join() все записи потоков видны основному потоку.
            first.join();
            second.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(counter.get());
    }
}

class Counter {
    private int value;

    // synchronized захватывает монитор this на время выполнения метода.
    // value++ состоит из чтения, сложения и записи — без блокировки
    // два потока могут потерять обновление.
    synchronized void increment() {
        value++;
    }

    int get() {
        return value;
    }
}
