package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasics {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(12);
        stack.push(10);
        stack.push(15);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
