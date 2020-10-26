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

        System.out.println("n. 1");
        System.out.println(makeList());
        System.out.println("n. 2");
        printList(l1);
        System.out.println("n. 3");
        printListWithIndexes(l1);
        System.out.println("n. 4");
        List<String> l1plusL2 = joinLists(l1, l2);
        System.out.println(l1plusL2);;
        System.out.println("n. 5");
        List<String> list3rev = clearReverseList(l3);
        System.out.println(list3rev);
        System.out.println("остался таким же " + l3);
        reverseList(l3);
        System.out.println(l3);
        System.out.println("n. 6");
        clearDeleteEven(l1);
        deleteEven(l4);
        clearDeleteInString(l4);
        deleteInString(l4);
        clearDeleteInInteger(makeList());
        deleteInInteger(makeList());
        System.out.println("n. 7");
        workWithFile("C:\\Users\\Elena\\IdeaProjects\\Java 3sem\\src\\text.txt");
    }

    public static List<Integer> makeList() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 100; i++) a.add(i);
        return a;
    }

    public static void printList(List<String> a){

        System.out.println("Элементов в списке: " + a.size());
        for(String element: a){
            System.out.println(element);
        }
    }

    public static void printListWithIndexes(List<String> a){

        System.out.println("Элементов в списке: " + a.size());
        for(int i = 0; i < a.size(); i++){
            System.out.println(i + ": " + a.get(i));
        }
    }

    public static List<String> joinLists(List<String> a, List<String> b) {
        ArrayList<String> new_list = new ArrayList<>(a);
        new_list.addAll(b);
        return(new_list);
    }

    public static List<String> clearReverseList(List<String> a) {
        ArrayList<String> reverseA = new ArrayList<>();

        for (int i = 0; i < a.size(); i++){
            reverseA.add(i, a.get(a.size() - i - 1));
        }
        return(reverseA); //новый список
    }

    public static List<String> reverseList(List<String> a) {
        ArrayList<String> helpA = new ArrayList<>(a);

        a.clear();
        for (int i = 0; i < helpA.size(); i++){
            a.add(i, helpA.get(helpA.size() - i - 1));
        }
        return(a); //старый измененный список
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