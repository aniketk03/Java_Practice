package collections;
import java.util.Stack;


public class Stackone {
    public static void main(String[] args)
    {
        Stack<String> animals = new Stack<>();
        animals.push("A");
        animals.push("B");
        animals.push("c");
        System.out.println(animals);

        System.out.println(animals.peek());

        System.out.println(animals.pop());
        System.out.println(animals);
    }
}
