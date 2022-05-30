package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputArrayLength, arrayElement, caunt =0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        inputArrayLength = scn.nextInt();

        int [] arr = new int[inputArrayLength];

        while (true){

            if (caunt != inputArrayLength){

                System.out.print("Dizinin\t" + (caunt+1) + ". elamanını giriniz\t:\t");
                arrayElement = scn.nextInt();
                arr[caunt] = arrayElement;
                caunt++;

            }else {

                break;

            }

        }

        smallestToLargest.sorting(arr);

    }

}
