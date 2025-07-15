package Problem4;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 = side3 = side1; // keep it equilateral
    }
}
