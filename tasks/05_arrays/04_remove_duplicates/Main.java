import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            boolean seen = false;
            // TODO: проверь, встречался ли a[i] среди a[0] .. a[i-1]
            if (!seen) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(a[i]);
            }
        }
        System.out.println(sb);
    }
}
