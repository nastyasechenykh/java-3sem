import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l2.add("э");

        System.out.println(makeList());
        System.out.println(joinLists(l1, l2));
    }

    public static List<Integer> makeList(){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 100; i++) a.add(i);
        return a;
    }

    public static List<String> joinLists(List<String> a, List<String> b){
        a.addAll(b);
        return(a);
    }

    public static void clearReverseList(List<String> a){
        ArrayList<String> reverseA = new ArrayList<>();

    }

    public static void reverseList(List<String> a){

    }
}
