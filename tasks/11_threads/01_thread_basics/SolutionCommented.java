import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n должно быть final (или effectively final), чтобы анонимный
        // класс мог его захватить.
        final int n = sc.nextInt();
        // Массив — объект: ссылка final, но содержимое можно менять
        // из другого потока.
        final long[] result = new long[1];
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                result[0] = sum;
            }
        });
        // start запускает НОВЫЙ поток; run() выполнился бы здесь же.
        thread.start();
        try {
            // join ждёт завершения потока и гарантирует видимость результата.
            thread.join();
        } catch (InterruptedException e) {
            // Восстанавливаем флаг прерывания.
            Thread.currentThread().interrupt();
        }
        System.out.println(result[0]);
    }
}
