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
        System.out.println(transliterator(rus, "терминатор"));
        System.out.println(letterQuantity("banana"));
        System.out.println(letterIndexList("banana"));
        frequencyDict("src/girls.txt");
    }

    public static String transliterator(Map<Character, String> a, String word) {
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            newWord += a.get(word.charAt(i));
        }
        return newWord;
    }

    public static Map letterQuantity(String word) {
        Map<Character, Integer> amount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!amount.containsKey(letter)) amount.put(letter, 1);
            else amount.put(letter, amount.get(letter) + 1);
        }
        return amount;
    }

    public static Map letterIndexList(String word) {
        Map<Character, List<Integer>> amount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!amount.containsKey(letter)) {
                amount.put(letter, new ArrayList<>());
            }
            amount.get(letter).add(i);
        }
        return amount;
    }

    public static void frequencyDict(String S) throws IOException {
        Path f = Paths.get(S);
        Map<String, Integer> dictionary = new HashMap<>();
        Map<String, Integer> dictionary2 = new TreeMap<>();
        Map<String, Integer> dictionary3 = new LinkedHashMap<>();
        TreeMap<String, Integer> sortedMap = new TreeMap<>();

        try (Scanner inc = new Scanner(f)) {
            while (inc.hasNext()) {
                inc.useDelimiter("[^а-яА-Я]+");
                String word = inc.next().toLowerCase();
                if (!dictionary.keySet().contains(word)) {
                    dictionary.put(word, 1);
                    dictionary2.put(word, 1);
                    dictionary3.put(word, 1);
                } else {
                    dictionary.put(word, dictionary.get(word) + 1);
                    dictionary2.put(word, dictionary2.get(word) + 1);
                    dictionary3.put(word, dictionary3.get(word) + 1);
                } sortedMap.putAll(dictionary);
            }
            try (PrintStream ps = new PrintStream("C:\\Users\\Elena\\IdeaProjects\\Java 3sem\\src\\dict.txt", "utf8")) {
                ps.println(dictionary);
                ps.println(dictionary2);
                ps.println(dictionary3);
                ps.println(sortedMap);
            }
        }
    }
}