package workWithInterface;

public class PrintableString implements Printable{
    private String line;

    public PrintableString(String l){
        this.line = l;
    }

    @Override
    public void print() {
        System.out.println(line);
    }
}
