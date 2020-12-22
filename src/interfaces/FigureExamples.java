package interfaces;

public class FigureExamples {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{new Circle(4), new EquilateralTriangle(9), new RightTriangle(3, 4, 5)};
        Square s1 = new Square(5);
        Rectangle r1= new Rectangle(7, 8);
        Rhombus rh1 = new Rhombus(8, 6);

        for(Figure geometry : figures){
            System.out.println(geometry.info());
            System.out.println("S = " + geometry.area());
            System.out.println("P = " + geometry.perimiter());
            System.out.println(geometry.capacity());
            System.out.println(Figure.capacity(geometry));
            //У прямоугольного прямоугольника наибольшая емкость
        }
    }
}
