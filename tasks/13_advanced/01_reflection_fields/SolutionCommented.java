import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;
}

public class SolutionCommented {
    public static void main(String[] args) {
        // getDeclaredFields возвращает все поля класса, включая приватные.
        Field[] fields = Person.class.getDeclaredFields();
        // Порядок полей не гарантирован спецификацией, поэтому сортируем по имени.
        Arrays.sort(fields, new Comparator<Field>() {
            @Override
            public int compare(Field a, Field b) {
                return a.getName().compareTo(b.getName());
            }
        });
        for (Field field : fields) {
            // getType().getSimpleName() даёт "int" и "String" без пакета.
            System.out.println(field.getName() + ": " + field.getType().getSimpleName());
        }
    }
}
