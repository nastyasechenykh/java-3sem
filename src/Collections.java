import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Collections {
    public static void main(String[] args) throws Exception {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();
        ArrayList<String> l4 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l2.add("э");
        l3.add("ba");
        l3.add("be");
        l3.add("le");
        l3.add("kA");
        l4.add("p");
        l4.add("q");
        l4.add("e");
        l4.add("4");
        l4.add("k");
        l4.add("5");

        System.out.println("n. 1");
        System.out.println(makeList());
        System.out.println("n. 2");
        joinLists(l1, l2);
        System.out.println("n. 4");
        clearReverseList(l3); //функция clearReverseList реализована без использования метода size
        reverseList(l3);
        System.out.println("n. 5");
        clearDeleteEven(l1);
        deleteEven(l4);
        clearDeleteInString(l4);
        deleteInString(l4);
        clearDeleteInInteger(makeList());
        deleteInInteger(makeList());
        System.out.println("n. 6");
        workWithFile("C:\\Users\\Elena\\IdeaProjects\\Java 3sem\\src\\text.txt");
    }

    public static List<Integer> makeList() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 100; i++) a.add(i);
        return a;
    }

    public static void joinLists(List<String> a, List<String> b) {
        a.addAll(b);
        System.out.println(a);
    }

    public static void clearReverseList(List<String> a) {
        int k = 0;
        ArrayList<String> reverseA = new ArrayList<>();

        for (String i : a) k++;
        while (k > 0) {
            reverseA.add(a.get(k - 1));
            k--;
        }
        System.out.println(reverseA); //новый список
        System.out.println(a); //старый остался неизмененным
    }

    public static void reverseList(List<String> a) {
        ArrayList<String> helpA = new ArrayList<>(a);

        a.clear();
        for (int i = 0; i < helpA.size(); i++){
            a.add(i, helpA.get(helpA.size() - i - 1));
        }
        System.out.println(a); //старый измененный список
    }

    public static void clearDeleteEven(List<String> a) {
        ArrayList<String> copyA = new ArrayList<>(a);

        for (int i = 0; i < copyA.size(); i++) {
            if (i % 2 == 0)
                copyA.set(i,"*");
        }
        for (int i = 0; i < copyA.size(); i++) {
            if (copyA.get(i).equals("*"))
                copyA.remove(i);
        }
        System.out.println(a); //неизменен
        System.out.println(copyA); //новый список
    }

    public static void deleteEven(List<String> a) {

        for (int i = 0; i < a.size(); i++) {
            if (i % 2 == 0)
                a.set(i, "*");
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("*"))
                a.remove(i);
        }
        System.out.println(a); //подмена старого списка
    }

    public static void clearDeleteInString(List<String> a) {
        ArrayList<String> copyA = new ArrayList<>(a);

        for(int i = 0; i < copyA.size(); i++){
            if(copyA.get(i).matches("[\\d]+")){
                if(copyA.get(i).charAt(copyA.get(i).length() - 1) % 2 == 0) copyA.remove(i);
            }
        }
        System.out.println(copyA); //новый список
        System.out.println(a); //старый неизменный список
    }

    public static void deleteInString(List<String> a) {

        for (int i = 0; i < a.size(); i++){
            if(a.get(i).matches("[\\d]+")){
                if(a.get(i).charAt(a.get(i).length() - 1) % 2 == 0) a.remove(i);
            }
        }
        System.out.println(a);
    }

    public static void clearDeleteInInteger(List<Integer> a) {
        ArrayList<Integer> copyAa = new ArrayList<>(a);

        for (int i = 0; i < copyAa.size(); i++) {
            if (copyAa.get(i) % 2 == 0) copyAa.remove(i);
        }
        System.out.println(a); //исходный список
        System.out.println(copyAa); //скопированный список
    }

    public static void deleteInInteger(List<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) a.remove(i);
        }
        System.out.println(a);
    }

    public static void workWithFile(String F) throws IOException {
        Path f = Paths.get(F);
        HashSet h = new HashSet();
        LinkedHashSet l = new LinkedHashSet();
        TreeSet t = new TreeSet();

        try (Scanner inc = new Scanner(f)) {
            while (inc.hasNext()){
                String word = inc.next().toLowerCase();
                if(word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',' || word.charAt(word.length() - 1) == ':' || word.charAt(word.length() - 1) == '!' || word.charAt(word.length() - 1) == '?') {
                    h.add(word.substring(0, word.length() - 1));
                    l.add(word.substring(0, word.length() - 1));
                    t.add(word.substring(0, word.length() - 1));
                }
                else {h.add(word); l.add(word); t.add(word);}
            }
        }
        System.out.println(h);
        System.out.println(l);
        System.out.println(t);
    }
}