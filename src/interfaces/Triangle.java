package interfaces;

public class Triangle implements Figure{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    @Override
    public double perimiter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double p = perimiter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String info() {
        return "Треугольник со сторонами: " + side1 + ", " + side2 + " и " + side3;
    }
}
