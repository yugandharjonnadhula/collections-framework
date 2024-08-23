package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // define stack
        Stack<Integer>  stk1 = new Stack<Integer>();

        // adding element into stack
        stk1.push(12);
        stk1.push(33);
        stk1.push(45);
        stk1.push(9);
        stk1.push(33);
        stk1.push(3);
        System.out.println("after psuhing or adding : "+stk1);

        // remove an element from stack
        stk1.pop();
        System.out.println("after poping 1 element : "+stk1);
        stk1.pop();
        System.out.println("after poping 2 element : "+stk1);

        Collections.sort(stk1);
        System.out.println("after sorting stk1 : "+stk1);

        // size of stk1
        System.out.println("size of stk1 is :" +stk1.size());

        // traversing the stk1
        // foreach way
        System.out.println("Using foreach loop to traverse the stk1");
        for(Integer listElement :stk1){
            System.out.println(listElement);
        }

        // iterator
        System.out.println("Using Iterator to traverse the stk1");
        Iterator itr1 = stk1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}