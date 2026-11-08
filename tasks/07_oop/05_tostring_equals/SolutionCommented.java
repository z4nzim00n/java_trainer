import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        int y1 = sc.nextInt();
        String t2 = sc.next();
        int y2 = sc.nextInt();
        Book b1 = new Book(t1, y1);
        Book b2 = new Book(t2, y2);
        // println сам вызывает b1.toString().
        System.out.println(b1);
        // equals сравнивает содержимое, а не ссылки.
        System.out.println(b1.equals(b2) ? "equal" : "not equal");
    }
}

class Book {
    private String title;
    private int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Переопределяем метод Object.toString().
    // @Override проверяет, что сигнатура действительно совпала.
    @Override
    public String toString() {
        return title + " (" + year + ")";
    }

    @Override
    public boolean equals(Object other) {
        // Тот же самый объект — сразу равны.
        if (this == other) {
            return true;
        }
        // null и объекты других типов не равны нашему.
        if (!(other instanceof Book)) {
            return false;
        }
        // После проверки instanceof приведение безопасно.
        Book b = (Book) other;
        // Строки сравниваем через equals, числа — через ==.
        return year == b.year && title.equals(b.title);
    }

    // Вместе с equals нужно переопределять hashCode:
    // равные объекты обязаны иметь одинаковый хэш.
    @Override
    public int hashCode() {
        return 31 * title.hashCode() + year;
    }
}
