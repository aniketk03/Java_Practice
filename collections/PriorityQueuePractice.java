package collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        Queue <Integer> values = new PriorityQueue<>(Comparator.reverseOrder());
        values.offer(5);
        values.offer(2);
        values.offer(1);

        System.out.println(values.peek());
        System.out.println(values.poll());
        System.out.println(values);
    }
}
