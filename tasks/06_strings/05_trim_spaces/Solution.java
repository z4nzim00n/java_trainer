import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(line.replaceAll("\\s+", " "));
        }
    }
}
