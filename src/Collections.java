import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Collections {
    public static void main(String[] args) throws Exception {
        List<String> l1 = List.of("a", "b", "c");
        List<String> l2 = List.of("э");
        List<String> l3 = new ArrayList<>(List.of("ba", "be", "le", "kA"));
        List<String> l4 = new ArrayList<>(List.of("p", "q", "e", "4", "k", "5"));
        List<String> ints = List.of("11", "22", "33", "55", "66", "88", "100", "3", "4");
        List<Integer> ints2 = List.of(11, 22, 33, 55, 66, 88, 100, 3, 4);

        System.out.println("n. 1");
        System.out.println(makeList());
        System.out.println("n. 2");
        printList(l1);
        System.out.println("n. 3");
        printListWithIndexes(l1);
        System.out.println("n. 4");
        List<String> l1plusL2 = joinLists(l1, l2);
        System.out.println(l1plusL2);
        ;
        System.out.println("n. 5");
        List<String> list3rev = clearReverseList(l3);
        System.out.println(list3rev);
        System.out.println("остался таким же " + l3);
        reverseList(l3);
        System.out.println(l3);
        System.out.println("n. 6");
        System.out.println("ints no even indices = " + clearDeleteEven(ints));
        List<String> mutableInts = new ArrayList<>(ints);
        deleteEven(mutableInts);
        System.out.println("ints no even indices = " + mutableInts);
        System.out.println("ints without even = " + clearDeleteInString(ints));
        mutableInts = new ArrayList<>(ints);
        deleteInString(mutableInts);
        System.out.println("ints without even = " + mutableInts);
        System.out.println("ints without even = " + clearDeleteInInteger(ints2));
        List<Integer> mutableInts2 = new ArrayList<>(ints2);
        deleteInInteger(mutableInts2);
        System.out.println("ints without even = " + mutableInts2);
        System.out.println("n. 7");
        workWithFile("C:\\Users\\Elena\\IdeaProjects\\Java 3sem\\src\\text.txt");
    }

    public static List<Integer> makeList() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 100; i++) a.add(i);
        return a;
    }

    public static void printList(List<String> a) {

        System.out.println("Элементов в списке: " + a.size());
        for (String element : a) {
            System.out.println(element);
        }
    }

    public static void printListWithIndexes(List<String> a) {

        System.out.println("Элементов в списке: " + a.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(i + ": " + a.get(i));
        }
    }

    public static List<String> joinLists(List<String> a, List<String> b) {
        ArrayList<String> new_list = new ArrayList<>(a);
        new_list.addAll(b);
        return (new_list);
    }

    public static List<String> clearReverseList(List<String> a) {
        ArrayList<String> reverseA = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            reverseA.add(i, a.get(a.size() - i - 1));
        }
        return (reverseA); //новый список
    }

    public static List<String> reverseList(List<String> a) {
        ArrayList<String> helpA = new ArrayList<>(a);

        a.clear();
        for (int i = 0; i < helpA.size(); i++) {
            a.add(i, helpA.get(helpA.size() - i - 1));
        }
        return (a); //старый измененный список
    }


    public static ArrayList<String> clearDeleteEven(List<String> a) {
        ArrayList<String> copyA = new ArrayList<>(a);

        for (int i = 0; i < a.size(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < copyA.size(); j++) {
                    if (a.get(i) == copyA.get(j)) {
                        copyA.remove(j);
                        break;
                    }
                }
            }
        }
        return copyA;
    }

    public static List<String> deleteEven(List<String> a) {
        ArrayList<String> helper = new ArrayList<>(a);

        for (int i = 0; i < helper.size(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a.size(); j++) {
                    if (helper.get(i) == a.get(j)) {
                        a.remove(j);
                        break;
                    }
                }
            }
        }
        return a; //подмена старого списка
    }

    public static ArrayList<String> clearDeleteInString(List<String> a) {
        ArrayList<String> copyA = new ArrayList<>(a);

        for (int i = 0; i < copyA.size(); i++) {
            if (copyA.get(i).matches("[\\d]+")) {
                if (copyA.get(i).charAt(copyA.get(i).length() - 1) % 2 == 0) {
                    copyA.remove(i);
                    i--;
                }
            }
        }
        return copyA; //старый неизменный список
    }

    public static List<String> deleteInString(List<String> a) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).matches("[\\d]+")) {
                if (a.get(i).charAt(a.get(i).length() - 1) % 2 == 0) {
                    a.remove(i);
                    i--;
                }
            }
        }
        return a;
    }

    public static ArrayList<Integer> clearDeleteInInteger(List<Integer> a) {
        ArrayList<Integer> copyAa = new ArrayList<>(a);

        for (int i = 0; i < copyAa.size(); i++) {
            if (copyAa.get(i) % 2 == 0) {
                copyAa.remove(i);
                i--;
            }
        }
        return copyAa; //скопированный список
    }

    public static List<Integer> deleteInInteger(List<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                a.remove(i);
                i--;
            }
        }
        return a;
    }

    public static void workWithFile(String F) throws IOException {
        Path f = Paths.get(F);
        HashSet h = new HashSet();
        LinkedHashSet l = new LinkedHashSet();
        TreeSet t = new TreeSet();

        try (Scanner inc = new Scanner(f)) {
            while (inc.hasNext()) {
                String word = inc.next().toLowerCase();
                if (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',' || word.charAt(word.length() - 1) == ':' || word.charAt(word.length() - 1) == '!' || word.charAt(word.length() - 1) == '?') {
                    h.add(word.substring(0, word.length() - 1));
                    l.add(word.substring(0, word.length() - 1));
                    t.add(word.substring(0, word.length() - 1));
                } else {
                    h.add(word);
                    l.add(word);
                    t.add(word);
                }
            }
        }
        System.out.println(h);
        System.out.println(l);
        System.out.println(t);
    }
}