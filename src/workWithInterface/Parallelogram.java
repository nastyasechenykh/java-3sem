package workWithInterface;

public abstract class Parallelogram {
    public int side1;
    public int side2;

    public Parallelogram(int s1, int s2){
        this.side1 = s1;
        this.side2 = s2;
    }

    public int perimeter(){
        return 2 * (side1 + side2);
    }

    public abstract double area();
}
