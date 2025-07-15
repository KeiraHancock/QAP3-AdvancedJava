package Problem3;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double value1, double value2) {
        super("Ellipse");
        this.a = Math.max(value1, value2);
        this.b = Math.min(value1, value2);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * (a * a + b * b) - ((a - b) * (a - b)) / 2);
    }
}
