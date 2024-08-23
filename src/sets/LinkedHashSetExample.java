
package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<String>();

        // add element into set1
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Sanjay");
        set1.add("Ajay");
        set1.add("Ravi");
        set1.add(null);
        set1.add(null);

        System.out.println("set1 content is  : "+set1);

        // remove
        set1.remove("Ravi");
        System.out.println("set1 content after removing  : "+set1);

        // size of set1
        System.out.println("size of set1 is :" +set1.size());

        // traversing the set1
        // foreach way
        System.out.println("Using foreach loop to traverse the set1");
        for(String setElement :set1){
            System.out.println(setElement);
        }

        // iterator
        System.out.println("Using Iterator to traverse the set1");
        Iterator itr1 = set1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
