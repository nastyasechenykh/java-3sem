package interfaces;

public interface Figure {

    double area();
    double perimiter();
    String info();

    static double capacity(Figure f) {
        double p = f.perimiter();
        return f.area() / (p * p);
    }

    default double capacity() {
        return area() / (perimiter() * perimiter());
    }
}
