import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            User user = new User(name);
            System.out.println(user.getId() + " " + user.getName());
        }
    }
}

class User {
    // Статическое поле принадлежит классу: одна переменная на всех.
    // Она переживает создание и удаление отдельных объектов.
    private static int nextId = 1;
    // Поля экземпляра: у каждого объекта свои значения.
    private int id;
    private String name;

    User(String name) {
        this.name = name;
        // Постфиксный ++: id получает текущее значение, затем счётчик растёт.
        // Первый пользователь — 1, второй — 2, и так далее.
        this.id = nextId++;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}
