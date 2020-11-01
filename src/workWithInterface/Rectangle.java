package workWithInterface;

public class Rectangle extends Parallelogram {
    public int length;
    public int width;

    public Rectangle(int l, int w) {
        super(l, w);
        this.length = l;
        this.width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    /* @Override
    public double perimiter() {
        return 2 * (length + width);
    } */

    //@Override
    public String info() {
        return "Прямоугольник со сторонами " + length + " и " + width;
    }

}
