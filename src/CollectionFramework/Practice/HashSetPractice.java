package CollectionFramework.Practice;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(30);
        hs.add(30);
        hs.add(30);
        System.out.println(hs);

        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("Juliya");
        hs1.add("Abhi");
        hs1.add("Jyoti");
        hs1.add("Mina");
        hs1.add("Rohit");
        System.out.println(hs1);

//        find their common elements;
        HashSet<Integer> hash = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();

        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);
        hash2.add(4);

        hash2.add(6);
        hash2.add(7);
        hash2.add(8);
        hash.retainAll(hash2);
        System.out.println(hash);

        hash.containsAll(hash2);
        System.out.println(hash);


    }
}
