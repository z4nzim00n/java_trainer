import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final long[] evenSum = new long[1];
        final long[] oddSum = new long[1];
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
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
