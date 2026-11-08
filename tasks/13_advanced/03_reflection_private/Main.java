import java.lang.reflect.Field;
import java.util.Scanner;

class Secret {
    private String value;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.hasNextLine() ? sc.nextLine() : "";
        try {
            Secret secret = new Secret();
            Field field = Secret.class.getDeclaredField("value");
            // TODO: разреши доступ к приватному полю через setAccessible(true)
            // TODO: запиши input в поле
            System.out.println("Value: " + field.get(secret));
        } catch (ReflectiveOperationException e) {
            System.out.println("Error: " + e.getClass().getSimpleName());
        }
    }
}
