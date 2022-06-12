package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(null);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }

        System.out.println("----------------");

        for (Integer element : list){

            System.out.println(element);

        }

        System.out.println("----------------");

        System.out.println(list.get(3));

        System.out.println("----------------");

        System.out.println(list.indexOf(1));

        System.out.println("----------------");

        list.add(2,15);

        for (Integer elements : list){

            System.out.println(elements);

        }

        System.out.println("----------------");

        list.remove(2);

        for (Integer elements : list){

            System.out.println(elements);

        }

    }

}
