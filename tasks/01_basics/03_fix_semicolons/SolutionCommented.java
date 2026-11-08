// import подключает класс Scanner из пакета java.util.
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        // Каждая инструкция в Java заканчивается точкой с запятой.
        // Компилятор не угадывает, где заканчивается инструкция.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int square = n * n;

        System.out.println(square);
    }
}