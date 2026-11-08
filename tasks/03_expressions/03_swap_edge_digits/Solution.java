import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n / 1000;
        int last = n % 10;
        int middle = (n % 1000) / 10;
        int result = last * 1000 + middle * 10 + first;
        System.out.println(result);
    }
}