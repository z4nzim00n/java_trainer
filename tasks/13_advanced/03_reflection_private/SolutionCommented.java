import java.lang.reflect.Field;
import java.util.Scanner;

class Secret {
    private String value;
}

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Пустой ввод трактуем как пустую строку.
        String input = sc.hasNextLine() ? sc.nextLine() : "";
        try {
            Secret secret = new Secret();
            // getDeclaredField видит приватные поля, в отличие от getField.
            Field field = Secret.class.getDeclaredField("value");
            // Без этой строки set и get бросят IllegalAccessException.
            field.setAccessible(true);
            field.set(secret, input);
            System.out.println("Value: " + field.get(secret));
        } catch (ReflectiveOperationException e) {
            // NoSuchFieldException или IllegalAccessException.
            System.out.println("Error: " + e.getClass().getSimpleName());
        }
    }
}
