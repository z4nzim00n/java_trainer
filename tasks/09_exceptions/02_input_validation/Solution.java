import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        try {
            int value = Integer.parseInt(line);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}
