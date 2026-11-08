import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;
}

public class Main {
    public static void main(String[] args) {
        Field[] fields = Person.class.getDeclaredFields();
        Arrays.sort(fields, new Comparator<Field>() {
            @Override
            public int compare(Field a, Field b) {
                return a.getName().compareTo(b.getName());
            }
        });
        for (Field field : fields) {
            // TODO: выведи имя поля и его тип в формате "имя: тип"
        }
    }
}
