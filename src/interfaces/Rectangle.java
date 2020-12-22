package interfaces;

public class Rectangle extends Parallelogram {
   public double l;
   public double w;

    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public double area() {
        return l * w;
    }


    /* @Override
    public double perimiter() {
        return 2 * (length + width);
    } */

    @Override
    public String info() {
        return "Прямоугольник со сторонами " + l + " и " + w;
    }

}
