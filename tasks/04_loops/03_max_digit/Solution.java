import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n /= 10;
        }
        System.out.println(max);
    }
}
