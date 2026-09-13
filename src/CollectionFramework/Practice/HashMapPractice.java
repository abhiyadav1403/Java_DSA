package CollectionFramework.Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

//        store name and their marks
        map.put("Abhi", 95);
        map.put("Jyoti",90);
        map.put("Karan",80);
        map.put("Shubham",85);
        System.out.println(map);

//        Store employee ID adn employee name
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Abhi");
        map1.put(2,"Jyoti");
        map1.put(3,"Karan");
        map1.put(4,"Shubham");
        map1.keySet();
        System.out.println(map1);

//        add products and their prices to a hashmap. Display all products and prices

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("Apple", 150);
        map2.put("Banana", 200);
        map2.put("Pineapple", 300);
        System.out.println(map2);

//        update the price of a product
        map2.replace("Banana", 100);
        System.out.println(map2);

//        remove a product from a hashmap using its key
        map2.remove("Pineapple");
        System.out.println(map2);

//        check whether a praticuler keys exists in a hashmap
        System.out.println(map2.containsKey("Pineapple"));

//        check whether a praticuler values exists in a hashmap
        System.out.println(map2.containsValue(150));

//        count the frequency of each number
        int[] numbers = {10, 20, 10, 30, 20, 10, 40 };

        Map<Integer, Integer> map3 = new HashMap<>();
        for(int num: numbers){
            map3.put(num, map3.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of Number:"+ map3);

//        count the frequency of each word
        HashMap<String,Integer> map4 = new HashMap<>();
        String [] str = {"Java","Python", "Java", "C++", "Python", "Java", "C#"};
        for (String s : str) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map4);

    }
}
