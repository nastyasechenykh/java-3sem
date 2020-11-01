package workWithInterface;

public class Square extends Parallelogram {
    public int side;

    public Square(int s){
        super(s, s);
        this.side = s;
    }

    @Override
    public double area() {
        return side * side;
    }

    /* @Override
    public double perimiter() {
        return 4 * side;
    } */

    //@Override
    public String info() {
        return "Квадрат со стороной " + side;
    }
}
