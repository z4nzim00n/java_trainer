import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long product = 1;
        boolean found = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                product *= digit;
                found = true;
            }
            n /= 10;
        }
        System.out.println(found ? product : 0);
    }
}
