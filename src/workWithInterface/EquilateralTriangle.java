package workWithInterface;
import static java.lang.Math.sqrt;

public class EquilateralTriangle implements Figure {
    private int side;

    public EquilateralTriangle(int s){
        this.side = s;
    }

    @Override
    public double area() {
        return side * side * sqrt(3)/4;
    }

    @Override
    public double perimiter() {
        return 3 * side;
    }

    @Override
    public String info() {
        return "Равносторонний треугольник со стороной " + side;
    }
}
