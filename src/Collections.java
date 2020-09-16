import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
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
        l4.add("k");

        System.out.println("n. 1");
        System.out.println(makeList());
        System.out.println("n. 2");
        joinLists(l1, l2);
        System.out.println("n. 4");
        clearReverseList(l3); //функции clearReverseList и
        reverseList(l3); //reverseList реализованы без использования метода size
        System.out.println("n. 5");
        clearDeleteEven(l1);
        deleteEven(l4);


        clearDeleteInInteger(makeList());
        deleteInInteger(makeList());
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
        String c = "";
        int k = 0;

        for (String x : a) k++;

        System.out.println(a);
    }

    public static void clearDeleteEven(List<String> a) {
        ArrayList<String> copyA = new ArrayList<>();

        copyA.addAll(a);
        for (int i = 0; i < copyA.size(); i++) {
            if (i % 2 == 0)
                copyA.remove(i);
        }
        System.out.println(a); //неизменен
        System.out.println(copyA); //новый список
    }

    public static void deleteEven(ArrayList<String> a) {

        for (int i = 0; i < a.size(); i++) {
            if (i % 2 == 0)
                a.remove(i);
        }
        System.out.println(a); //подмена старого списка
    }

    /* public static void clearDeleteInString(List<String> a) {

    }

    public static void deleteInString(List<String> a) {

        for (String x: a){
            if (x % 2 == 0) a.remove(x);
        }
        System.out.println(a);
    } */

    public static void clearDeleteInInteger(List<Integer> a) {
        ArrayList<Integer> copyAa = new ArrayList<>();

        copyAa.addAll(a);
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
}