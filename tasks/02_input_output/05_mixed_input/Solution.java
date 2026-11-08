import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(name + ": " + age);
    }
}