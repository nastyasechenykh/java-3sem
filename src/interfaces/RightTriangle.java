package interfaces;

public class RightTriangle extends Triangle {
    private double leg1;
    private double leg2;

    public RightTriangle(double a, double b, double c) {
        super(a, b, c);
        this.leg1 = a;
        this.leg2 = b;
    }

    @Override
    public double area() {
        return leg1 * leg2 / 2;
    }

    @Override
    public double perimiter() {
        return leg2 + leg1;
    }

    @Override
    public String info() {
        return "Прямоугольный треугольник с катетами " + leg1 + " и " + leg2;
    }
}
