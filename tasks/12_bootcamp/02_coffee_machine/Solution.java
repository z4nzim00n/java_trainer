import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int cups = people * 2;
        int water = cups * 200;
        int coffee = cups * 20;
        System.out.println("Cups: " + cups);
        System.out.println("Water: " + water + " ml");
        System.out.println("Coffee: " + coffee + " g");
    }
}
