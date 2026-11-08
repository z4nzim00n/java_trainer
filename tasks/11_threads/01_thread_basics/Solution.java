import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
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
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(result[0]);
    }
}
