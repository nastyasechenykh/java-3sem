import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Maps {
    public static void main(String[] args) throws IOException {
        char[] set1 = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] set2 = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "i", "y", "", "e", "iu", "ja"};
        Map<Character, String> rus = new HashMap<>();
        for (int i = 0; i < set1.length; i++) {
            rus.put(set1[i], set2[i]);
        }
        System.out.println(Transliterator(rus, "терминатор"));
        System.out.println(letterQuantity("banana"));
        System.out.println(letterIndexList("banana"));
        frequencyDict("C:\\Users\\Elena\\IdeaProjects\\Java 3sem\\src\\girls.txt");
    }

    public static String Transliterator(Map<Character, String> a, String word) {
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            for (Character key : a.keySet()) {
                if (word.charAt(i) == key) newWord += a.get(key);
            }
        }
        return newWord;
    }

    public static Map letterQuantity(String word) {
        Map<Character, Integer> amount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!amount.keySet().contains(word.charAt(i))) amount.put(word.charAt(i), 1);
            else amount.put(word.charAt(i), amount.get(word.charAt(i)) + 1);
        }
        return amount;
    }

    public static Map letterIndexList(String word) {
        Map<Character, List<Integer>> amount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!amount.keySet().contains(word.charAt(i))) {
                amount.put(word.charAt(i), new ArrayList<>());
            }
            amount.get(word.charAt(i)).add(i);
        }
        return amount;
    }

    public static void frequencyDict(String S) throws IOException {
        Path f = Paths.get(S);
        Map<String, Integer> dictionary = new HashMap<>();

        try (Scanner inc = new Scanner(f)) {
            while (inc.hasNext()) {
                String word = inc.next().toLowerCase();
                if (!dictionary.keySet().contains(word)) dictionary.put(word, 1);
                else dictionary.put(word, dictionary.get(word) + 1);
            } //inc.useDelimiter(".");
            try (PrintStream ps = new PrintStream("C:\\Users\\Elena\\IdeaProjects\\Java 3sem\\src\\dict.txt", "utf8")) {
                ps.println(dictionary);
            }
        }
    }
}