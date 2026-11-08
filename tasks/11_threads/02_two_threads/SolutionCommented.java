import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        // У каждого потока своя ячейка результата — общих данных нет.
        final long[] evenSum = new long[1];
        final long[] oddSum = new long[1];
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Шаг 2: только чётные числа.
                for (int i = 2; i <= n; i += 2) {
                    evenSum[0] += i;
                }
            }
        });
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= n; i += 2) {
                    oddSum[0] += i;
                }
            }
        });
        // Оба потока запускаются до ожидания — тогда они работают параллельно.
        evenThread.start();
        oddThread.start();
        try {
            // Ждём завершения обоих.
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("even: " + evenSum[0]);
        System.out.println("odd: " + oddSum[0]);
    }
}
