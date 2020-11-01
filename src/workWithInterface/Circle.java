package workWithInterface;

public class Circle implements Figure {
    private int radius;
    private double pi = 3.14;

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimiter() {
        return 2 * pi * radius;
    }

    @Override
    public String info() {
        return "Круг с радиусом " + radius;
    }

    @Override
    public double dCapacity(){
        return 1 / (4 * pi);
    }
}
