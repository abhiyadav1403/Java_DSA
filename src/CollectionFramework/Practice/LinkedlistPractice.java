package CollectionFramework.Practice;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedlistPractice {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
//  Add the element  in the begining
        list.addFirst("Mukesh");
        list.addFirst("Daniel");
        list.addFirst("Karan");
        list.addFirst("John");
        list.addFirst("Sara");
        System.out.println(list);

//        remove the element first and last

        LinkedList<Integer> lst = new  LinkedList<>();
        lst.addFirst(1);
        lst.addFirst(2);
        lst.addFirst(3);
        lst.addFirst(4);
        lst.addFirst(5);
        lst.removeFirst();
        lst.removeLast();
        System.out.println(lst);

//        replace the one to other
       LinkedList<String> list1 = new LinkedList<>();
       list1.addFirst("Mohak");
       list1.addFirst("Soris");
       list1.addFirst("Physics");
       list1.addFirst("Maths");
       list1.addFirst("Chemistry");
        System.out.println(list1);

        list1.set(4,"Biology");
        System.out.println(list1);

//        check whether a practicular number exists or not
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(1);
        list2.addFirst(2);
        list2.addFirst(3);
        list2.addFirst(4);
        list2.addFirst(5);
        System.out.println(list2.contains(20));

        list2.peek();
        System.out.println(list2);

        list2.poll();
        System.out.println(list2);
    }
}
