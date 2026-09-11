package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasis {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
//      default behaviour  -> Integer -> less value -> high priority -> minheap
        queue.offer(29);
        queue.offer(13);
        queue.offer(20);
        queue.offer(22);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Queue<Integer> q = new PriorityQueue<>((a,b)->(b-a));
//        maxHeap -> Integers -> high value -> high priority
        q.offer(29);
        q.offer(13);
        q.offer(20);
        q.offer(22);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);


    }
}
