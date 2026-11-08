import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p1 = new Point(x, y);
        Point p2 = new Point();
        System.out.println(p1.coords());
        System.out.println(p2.coords());
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String coords() {
        return x + " " + y;
    }
}
