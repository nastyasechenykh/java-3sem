package interfaces;

public abstract class Parallelogram implements Figure{
    public double side1;
    public double side2;

    public Parallelogram(double s1, double s2){
        this.side1 = s1;
        this.side2 = s2;
    }

    public double perimeter(){
        return 2 * (side1 + side2);
    }

    public abstract double area();
}
