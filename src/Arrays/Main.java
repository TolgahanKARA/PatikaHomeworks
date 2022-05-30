package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        arr = HelperArray.filled(arr, 1, 8 ,3 );
        System.out.println(Arrays.toString(arr));


    }

}
