public class Poem {
    private String[] poem;

    public Poem(String[] poem){
        this.poem = poem;
    }

    public void findPhymes(){
        for (int k = 0; k < poem.length - 1; k++) {
            for (int i = 1; i < poem.length; i++) {
                if (poem[k].substring(poem[k].length() - 3, poem[k].length() - 1).equals(poem[i].substring(poem[i].length() - 3, poem[i].length() - 1)) && (i != k))
                    System.out.println("Строка " + (k + 1) + " рифмуется со строкой " + (i + 1));
            }
        }
    }
}
