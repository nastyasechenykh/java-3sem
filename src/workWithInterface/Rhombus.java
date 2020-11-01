package workWithInterface;
import static java.lang.Math.sqrt;

public class Rhombus extends Parallelogram {
    private int dia1;
    private int dia2;

    public Rhombus(int d1, int d2){
        super( (int) sqrt(d1* d1/4 + d2 * d2/4), (int)sqrt(d1* d1/4 + d2 * d2/4));
        this.dia1 = d1;
        this.dia2 = d2;
    }

    @Override
    public double area() {
        return dia1 * dia2 * 0.5;
    }

    /* @Override
    public double perimiter() {
        return 2 * sqrt(dia1 * dia1 + dia2 * dia2);
    } */

    //@Override
    public String info() {
        return "Ромб с диагоналями " + dia1 + " и " + dia2;
    }
}
