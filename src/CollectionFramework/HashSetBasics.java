package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Abhi");
        Student s2 = new Student(1, "Abhi");
        Student s3 = new Student(1, "Abhi");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set) ;





//        Set<Integer> st = new HashSet<>();
//        Set<Integer> st  = new LinkedHashSet<>();
        Set<Integer> st = new TreeSet<>();
//        HasedSet -> 0(1)
//        LinkedHashSet -> 0(n)
//        TreeSet  -> BST -> o(log n)
//         st.add(2);
//        st.add(2);
//        st.add(10);
//        st.add(10);
//        st.add(9);
//        st.add(20);
//        System.out.println(st);
//        System.out.println(st.size());
//
//        Set<Integer> st1 = new HashSet<>();
//        Set<Integer> st2 = new HashSet<>();
//
//        st1.add(10);
//        st1.add(20);
//        st1.add(11);
//        st1.add(12);
//        st1.add(13);
//
//
//        st2.add(10);
//        st2.add(11);
//        st2.add(21);
//        st2.add(22);
//        st2.add(23);
//
//        System.out.println(st1);
//        st1.retainAll(st2);
//        System.out.println(st1);
//
//        System.out.println(st2);
//
////        System.out.println(st1.contains(st2));
//        System.out.println(st2.contains(st1));


    }
}
