import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        int y1 = sc.nextInt();
        String t2 = sc.next();
        int y2 = sc.nextInt();
        Book b1 = new Book(t1, y1);
        Book b2 = new Book(t2, y2);
        System.out.println(b1);
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

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Book)) {
            return false;
        }
        Book b = (Book) other;
        return year == b.year && title.equals(b.title);
    }

    @Override
    public int hashCode() {
        return 31 * title.hashCode() + year;
    }
}
