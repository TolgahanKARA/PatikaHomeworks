package Sorting;

import java.util.Arrays;

public class smallestToLargest {

    static int temp, minIndex;

    public static void sorting(int[] arr) {

        System.out.println("Sırasız Dizi :"+ Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    minIndex=arr[i];
                    arr[i]=arr[j];
                    arr[j]=minIndex;
                }
            }
        }

        System.out.println("Sıralı dizi :"+ Arrays.toString(arr));

    }

}
