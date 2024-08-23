
package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // define hashmap
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        // adding element into map
        map1.put(101,"Mango");
        map1.put(102,"Grapes");
        map1.put(103,"Apple");
        map1.put(104,"Grapes");
        map1.put(103,"Guava");//overrides apple and prints guava
        map1.put(102,"Banana");// overrides grapes and prints banana
        map1.put(105,"Banana");
        map1.put(105,"Orange");// overirdes banana and prints organe
        System.out.println("map1 is : "+map1);

        System.out.println("map1 size is  : "+map1.size());

        // remove data
        map1.remove(104);
        System.out.println("after removing one element map1 is : "+map1);

        // print specific element
        System.out.println("element of 103 key is  : "+map1.get(103));


        // traversing the hashmap using foreach
        System.out.println("Traversing map1 using foreach loop");
        for (Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"--------"+m1.getValue());
        }
    }
}
