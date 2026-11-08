import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int k = sc.nextInt();
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

    synchronized void increment() {
        value++;
    }

    int get() {
        return value;
    }
}
