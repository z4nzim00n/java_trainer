import java.lang.reflect.Method;
import java.util.Scanner;

class Calculator {
    public String greet(String name) {
        return "Hello, " + name;
    }

    public int square(int value) {
        return value * value;
    }
}

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Без ввода программа должна просто завершиться.
        if (!sc.hasNextLine()) {
            return;
        }
        String[] parts = sc.nextLine().trim().split("\\s+");
        String command = parts[0];
        String argument = parts.length > 1 ? parts[1] : "";
        Calculator calculator = new Calculator();
        try {
            Method method;
            Object result;
            if (command.equals("greet")) {
                // Сигнатура greet(String): второй аргумент getMethod — String.class.
                method = Calculator.class.getMethod("greet", String.class);
                result = method.invoke(calculator, argument);
            } else {
                // У square параметр int, поэтому именно int.class, а не Integer.class.
                method = Calculator.class.getMethod("square", int.class);
                // invoke упакует 7 в Integer, метод получит примитив 7.
                result = method.invoke(calculator, Integer.parseInt(argument));
            }
            // invoke всегда возвращает Object: String или Integer.
            System.out.println(result);
        } catch (ReflectiveOperationException e) {
            // NoSuchMethodException, IllegalAccessException, InvocationTargetException
            System.out.println("Error: " + e.getClass().getSimpleName());
        }
    }
}
