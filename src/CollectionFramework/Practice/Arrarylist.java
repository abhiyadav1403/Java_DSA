package CollectionFramework.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrarylist {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<String>();
//        lst.add("Rohan");
//        lst.add("Rohit");
//        lst.add("Abhi");
//        lst.add("Jyoti");
//        lst.add("Juli");
//
//        System.out.println(lst);

//        lst.add("Mango");
//        lst.add("Apple");
//        lst.add("Banana");
//        lst.add("Pear");
//        lst.add("Pizza");
//        System.out.println(lst);

//        lst.remove(3);
//        System.out.println(lst);

        lst.add("Lucknow");
        lst.add("Mumbai");
        lst.add("Delhi");
        lst.add("Pune");
        lst.add("Goa");
        System.out.println(lst.contains("Delhi"));
        Collections.sort(lst);
        System.out.println("Sort the list in ascending order:"+lst);
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println("Sort the list in descending order:"+lst);



        List<Integer> lt = new ArrayList<Integer>();
        lt.add(2);
        lt.add(3);
        lt.add(4);
        lt.add(5);
        lt.add(6);
        lt.add(7);
        lt.add(8);
        lt.add(9);
        lt.add(10);
        System.out.println(lt);

//        find the maximum element in the arraylist

        Collections collections = null;
        System.out.println(collections.max(lt));

//        Second approch -> find the maximum element in the arraylist

        int mx = lt.get(0);
        for (int i = 0; i < lt.size(); i++) {
            if (mx < lt.get(i)) {
                mx = lt.get(i);
            }
        }
        System.out.println("Maximum Element in ArrayList:" + mx);


        System.out.println("Minimum Element in ArrayList:"+ Collections.min(lt));

        int sum =0;
        int avg =0;
        for(Integer num: lt){
            sum += num;
            avg = sum/lt.size();
        }
        System.out.println("Sum :" + sum);
        System.out.println("Avgerage :"+ avg);

//        Sort the number in Ascending and descending order

        collections.sort(lt);
        System.out.println("Sort the list in ascending order:"+ lt);
        Collections.sort(lt, Collections.reverseOrder());
        System.out.println("Sort the list in descending order:"+ lt);
    }
}


