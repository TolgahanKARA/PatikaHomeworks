package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(100);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(null);

        System.out.println(hashSet.contains(15));
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.add(15));
        hashSet.remove(10);

        for (Integer number : hashSet){

            System.out.println(number);

        }

        //Iterater collectionlarda gezmeyi sağlayan bir yapı
        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }

    }

}
