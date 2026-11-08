import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String reversed = new StringBuilder(line).reverse().toString();
        System.out.println(reversed);
    }
}
