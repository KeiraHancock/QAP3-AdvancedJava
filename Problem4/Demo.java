package Problem4;

public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[4];
        shapes[0] = new Circle(3);
        shapes[1] = new Ellipse(5, 3);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        System.out.println("Before scaling:");
        for (Scalable s : shapes) {
            System.out.println(s);
        }

        scaleAll(shapes, 2); // scale by factor of 2

        System.out.println("\nAfter scaling by factor of 2:");
        for (Scalable s : shapes) {
            System.out.println(s);
        }
    }

    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable s : shapes) {
            s.scale(factor);
        }
    }
}
