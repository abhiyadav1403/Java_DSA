package CollectionFramework;

import java.util.ArrayList;

public class collectionFramework1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(32);
        list.add(40);
        System.out.println(list);
        list.add(20);
        list.add(19);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(22);
        list1.add(15);
        list1.add(101);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
//        list1.removeAll(list1);
//        System.out.println(list1);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);

    }
}
