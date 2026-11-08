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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                method = Calculator.class.getMethod("greet", String.class);
                // TODO: вызови method на calculator с аргументом argument
                result = null;
            } else {
                method = Calculator.class.getMethod("square", int.class);
                // TODO: вызови method на calculator с числом из argument
                result = null;
            }
            System.out.println(result);
        } catch (ReflectiveOperationException e) {
            System.out.println("Error: " + e.getClass().getSimpleName());
        }
    }
}
