import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final long[] result = new long[1];
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO: посчитай сумму чисел от 1 до n и сохрани в result[0]
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(result[0]);
    }
}
