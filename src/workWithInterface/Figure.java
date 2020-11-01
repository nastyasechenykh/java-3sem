package workWithInterface;

public interface Figure {

    double area();
    double perimiter();
    String info();
    static double capacity(Figure f){
        return f.area() / (f.perimiter() * f.perimiter());
    }
    default double dCapacity(){
        return area() / (perimiter() * perimiter());
    }
}
