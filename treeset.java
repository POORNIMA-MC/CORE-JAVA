import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(25);
        t.add(125);
        t.add(175);
        t.add(50);
        t.add(80);
        t.add(100);
        t.add(45);
        t.add(18);
        t.add(7);
        System.out.println(t);
        TreeSet t1 = new TreeSet();
        t.add(25);
        t.add(125);
        t.add(175);
        t.add(50);
        t.add(80);
        t.add(100);
        t.add(45);
        t.add(18);
        t.add(7);
        t.addAll(t1);
        System.out.println(t.higher(50));
        System.out.println(t.lower(50));
        System.out.println(t.descendingSet());
        System.out.println(t.higher(50));
        System.out.println(t.higher(23));
        System.out.println(t.floor(23));
        System.out.println(t.contains(1));
        System.out.println(t.size());
        t.pollFirst();
        System.out.println(t);
        t.pollLast();
        System.out.println(t);

    }
}