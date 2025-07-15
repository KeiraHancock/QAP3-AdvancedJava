package Problem2;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1.1f, 2.2f);
        System.out.println("Point p1: " + p1);

        MovablePoint mp1 = new MovablePoint(3.3f, 4.4f);
        System.out.println("MovablePoint mp1: " + mp1);

        MovablePoint mp2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Before move: " + mp2);
        mp2.move();
        System.out.println("After move: " + mp2);
    }
}
