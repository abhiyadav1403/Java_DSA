package CollectionFramework;



import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(15);
        q.offer(20);
        q.offer(25);
        System.out.println(q);
        System.out.println(q.size());

        q.offer(12 );
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

        Deque<Integer> d = new LinkedList<>();
        d.offer(100);
        d.offerFirst(120);
        d.offer(123);
        d.offerLast(140);
        System.out.println(d);
        d.getFirst();
        System.out.println(d.peekLast());
        System.out.println(d.pollFirst());



    }
}
