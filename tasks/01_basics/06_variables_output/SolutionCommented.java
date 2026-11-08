public class SolutionCommented {
    public static void main(String[] args) {
        // Примитивные типы:
        int i = 42;          // целое число
        double d = 3.14;     // вещественное число
        boolean b = true;    // логическое значение
        char c = 'A';        // один символ в одинарных кавычках

        // String — ссылочный тип, строка в двойных кавычках.
        String s = "Hello";

        // Оператор + со строкой выполняет конкатенацию:
        // число или boolean превращаются в текст и приклеиваются к строке.
        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("boolean: " + b);
        System.out.println("char: " + c);
        System.out.println("String: " + s);
    }
}