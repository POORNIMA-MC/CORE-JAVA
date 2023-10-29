import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque d1 = new ArrayDeque<>();
        d1.add("Poornima");
        d1.add(123);
        d1.add(12.3);
        d1.add(12.3f);
        System.out.println(d1);
        ArrayDeque d2 = new ArrayDeque<>();
        d2.add("hjds");
        d2.add("kdshj");
        d2.add("dsjk");
        System.out.println(d2);
        d1.addAll(d2);
        System.out.println(d1);
        d1.pop();
        System.out.println(d1);
        d1.push("Neha");
        System.out.println(d1);
        d2.clear();
        System.out.println(d2);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());



    }
}