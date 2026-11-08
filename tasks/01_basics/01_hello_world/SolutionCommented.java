// Имя публичного класса обязано совпадать с именем файла:
// файл SolutionCommented.java -> класс SolutionCommented.
public class SolutionCommented {
    // Точка входа в программу. JVM ищет метод с точно такой сигнатурой:
    // public static void main(String[] args).
    public static void main(String[] args) {
        // println печатает строку и добавляет перенос строки в конце.
        // print напечатал бы без переноса — тесты это проверяют.
        System.out.println("Hello, Java!");
    }
}