package interfaces;
import static java.lang.Math.sqrt;

public class Rhombus extends Parallelogram {
    private double dia1;
    private double dia2;

    public Rhombus(double d1, double d2){
        super(sqrt(d1* d1/4 + d2 * d2/4), sqrt(d1* d1/4 + d2 * d2/4));
        this.dia1 = d1;
        this.dia2 = d2;
    }

    @Override
    public double area() {
        return dia1 * dia2 * 0.5;
    }

    @Override
    public double perimiter() {
        return 2 * sqrt(dia1 * dia1 + dia2 * dia2);
    }

    @Override
    public String info() {
        return "Ромб с диагоналями " + dia1 + " и " + dia2;
    }
}
