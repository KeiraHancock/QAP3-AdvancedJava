package Problem4;

public class Triangle extends Shape {
    protected double side1, side2, side3;

    public Triangle(double a, double b, double c) {
        super("Triangle");

        if (a + b > c && b + c > a && c + a > b) {
            this.side1 = a;
            this.side2 = b;
            this.side3 = c;
        } else {
            System.out.println("Invalid triangle sides.");
            System.exit(1);
        }
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
