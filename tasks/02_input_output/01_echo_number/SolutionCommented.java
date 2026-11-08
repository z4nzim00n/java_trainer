import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        // Scanner — стандартный способ читать ввод в Java.
        // System.in — поток стандартного ввода (то, что приходит из терминала/файла).
        Scanner sc = new Scanner(System.in);

        // nextInt() читает следующее целое число и пропускает пробелы/переводы строк до него.
        int n = sc.nextInt();

        // println добавляет \n в конце — тесты ждут именно перенос.
        System.out.println(n);
    }
}