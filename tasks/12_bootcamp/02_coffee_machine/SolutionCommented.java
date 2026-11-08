import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        // Два человека пьют по 2 чашки, на чашку 200 мл и 20 г.
        // Числа можно было бы вынести в static final константы —
        // в маленькой программе допустимо и так.
        int cups = people * 2;
        int water = cups * 200;
        int coffee = cups * 20;
        System.out.println("Cups: " + cups);
        System.out.println("Water: " + water + " ml");
        System.out.println("Coffee: " + coffee + " g");
    }
}
