import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        char[] set1 = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] set2 = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "i", "y", "", "e", "iu", "ja"};
        Map<Character, String> rus = new HashMap<>();
        for (int i = 0; i < set1.length; i++) {
            rus.put(set1[i], set2[i]);
        }
        System.out.println(Transliterator(rus, "терминатор"));
        System.out.println(letterQuantity("banana"));
        System.out.println(letterIndexList("banana"));
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


        return amount;
    }
}
