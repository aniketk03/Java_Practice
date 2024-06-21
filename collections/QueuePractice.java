package collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args)
    {
        Queue<Integer> values = new LinkedList<>();
        values.offer(1);
        values.offer(2);
        values.offer(3);
        System.out.println(values.peek());
        System.out.println(values.poll());
        System.out.println(values);
    }
}
