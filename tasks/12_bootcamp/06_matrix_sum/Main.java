import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        long sum = 0;
        int max = matrix[0][0];
        // TODO: пройди по всем ячейкам, накапливая сумму и обновляя максимум
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }
}
