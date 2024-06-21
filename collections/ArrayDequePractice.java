package collections;
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequePractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> values = new ArrayDeque<>();
        values.offer(1);
        values.offerFirst(2);
        values.offerLast(3);
        System.out.println(values);

        System.out.println(values.peekFirst());
        System.out.println(values.peekLast());

        System.out.println(values.pollFirst());
        System.out.println(values.pollLast());

        System.out.println(values);
    }
}
