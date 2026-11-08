import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean special = n % 3 == 0 || n % 10 == 7;
        System.out.println(special);
    }
}
