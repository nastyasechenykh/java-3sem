package workWithInterface;

public class RightTriangle implements Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(int a, int b) {
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
