package repeatingNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int numberOfArrayElements, arrayElements, caunt = 0;
    static boolean contination = true;
    static int[] arr ;


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Dizi eleman sayısını giriniz :");
        numberOfArrayElements = scn.nextInt();

        arr = new int[numberOfArrayElements];


        while (contination){

            if (caunt != arr.length){

                System.out.print("Dizinin " + (caunt+1) + ". elemanı :");
                arrayElements = scn.nextInt();

                arr[caunt] = arrayElements;

                caunt++;

            }else {

                contination = false;
                break;

            }


        }

        System.out.println("Dizinin elemanları :" + Arrays.toString(arr));

        Arrays.sort(arr);

        repeatingElement.repeat(arr);



    }

}
