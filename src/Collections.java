import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l2.add("э");
        l3.add("ba");
        l3.add("be");
        l3.add("le");
        l3.add("kA");

        System.out.println(makeList());
        joinLists(l1, l2);
        clearReverseList(l3);
        reverseList(l3);
        //clearDeleteEven(l3);
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

    public static void reverseList(List<String> a){
        String c = "";
        int k = 0;

        for (String x : a) k++;

        System.out.println(a);
    }

    //public static void clearDeleteEven(List<String> a) {
    //    ArrayList<String> copyA = new ArrayList<>();

    //    for (String x : a) copyA.add(x);

    //}
}
