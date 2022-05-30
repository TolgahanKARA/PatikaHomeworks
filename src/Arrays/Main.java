package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        arr = HelperArray.filled(arr, 1, 8 ,3 );
        System.out.println(Arrays.toString(arr));

        int[] arrO = {3, 5, 79, 12, 25, -3, 66, 2, -49, 152};

        System.out.println(HelperArray.find(arrO));
        System.out.println("-----------");
        System.out.println(Arrays.toString(arrO));
        System.out.println("-----------");

        System.out.println(Arrays.toString(HelperArray.copy(arrO,5)));

        System.out.println("------------");
        System.out.println(Arrays.toString(HelperArray.copyRange(arrO,2,7)));


    }

}
