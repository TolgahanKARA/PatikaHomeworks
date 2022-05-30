package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        arr = HelperArray.filled(arr, 1, 8 ,3 );
//        System.out.println(Arrays.toString(arr));
//
//        int[] arrO = {3, 5, 79, 12, 25, -3, 66, 2, -49, 152};
//
//        System.out.println(HelperArray.find(arrO));
//        System.out.println("-----------");
//        System.out.println(Arrays.toString(arrO));
//        System.out.println("-----------");
//
//        System.out.println(Arrays.toString(HelperArray.copy(arrO,5)));
//
//        System.out.println("------------");
//        System.out.println(Arrays.toString(HelperArray.copyRange(arrO,2,7)));
//
//        System.out.println("------------");
//        System.out.println("------------");
//
//        int[] list1 = {1, 2, 3, 4};
//        int[] list2 = {1, 2, 3, 4};
//
//        System.out.println(HelperArray.equals(list1,list2));
//
//        int [] numbers = {1, 2, 3, 4, 5, 6};
//
//        System.out.println(HelperArray.average(numbers));
////Harmonik seri dizi
//        int [] arr = {5, 8, 11};
//
//        arrayHarmonicAvarage.harmonicAvarage(arr);

        //Dizideki max ve min değeri bulma

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        arrayMinMaxValue.minMaxValue(list);

        System.out.println("-----------");

        Scanner scn = new Scanner(System.in);
        int enterValue = scn.nextInt();

        arrayMinMaxValue.nearestMinMaxValue(list, enterValue);

    }

}
