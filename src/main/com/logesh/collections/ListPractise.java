package src.main.com.logesh.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListPractise {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> list2 = Arrays.asList(8,9,10);
        list.peek();

       System.out.println(list.add(1));
        list.add(4);
        list.add(2);
        list.add(3);
        list.addAll(list2);
       // list.removeAll(list2);
        list.retainAll(list2);
        System.out.println("size: "+list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(4));
        System.out.println(list.containsAll(list2));
        list.forEach(System.out::println);
        Integer[] arr = list.toArray(new Integer[0]);

        ListIterator<Integer> it = list.listIterator();
        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
        while(it.hasNext()){
            System.out.print(it.next()+" ");
            it.remove();
        }
        System.out.println(list.isEmpty());

    }
}
