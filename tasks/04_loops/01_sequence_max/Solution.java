import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
