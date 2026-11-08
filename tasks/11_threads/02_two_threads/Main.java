import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final long[] evenSum = new long[1];
        final long[] oddSum = new long[1];
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO: просуммируй чётные числа от 1 до n
            }
        });
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO: просуммируй нечётные числа от 1 до n
            }
        });
        evenThread.start();
        oddThread.start();
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("even: " + evenSum[0]);
        System.out.println("odd: " + oddSum[0]);
    }
}
