package interfaces;

public class PrintableExamples {
    public static void main(String[] args) {
        PrintableLetter pl = new PrintableLetter("x", 10);
        PrintableString ps = new PrintableString("asdf");
        //Printable[] things = new Printable[]{new Drawing(3,5, 'x'), new PrintableLetter("lol", 3), new PrintableString("cucumber"),  };

        pl.print();
        ps.print();
    }
}
