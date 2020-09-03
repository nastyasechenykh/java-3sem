public class PoemCheck {
    public static void main(String[] args) {
        String[] s = {"Кошка", "Пень", "Картошка", "День"};
        Poem p = new Poem(s);
        p.findPhymes();
    }
}
