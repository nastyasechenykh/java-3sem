package workWithInterface;

public class PrintableLetter implements Printable{
    private String symbol;
    private int amount;

    public PrintableLetter(String s, int a){
        this.symbol = s;
        this.amount = a;
    }

    @Override
    public void print() {
        for(int i = 0; i <= amount; i++){
            System.out.print(symbol);
        }
    }
}
