package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsPractice {
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>();
        values.add(1);
        values.add(1);
        values.add(4);
        values.add(2);
        System.out.println(values);

        values.remove(2);
        System.out.println(values);

        System.out.println(values.size());
        System.out.println(values.contains(3));
        values.clear();
        System.out.println(values);
    }
}
