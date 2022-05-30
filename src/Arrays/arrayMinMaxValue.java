package Arrays;

import java.util.Arrays;

public class arrayMinMaxValue {

    public static void minMaxValue(int arr[]) {

        int maxValue = 0, minValue = 0;

        for (int i = 0; i < arr.length; i++){

            if (i == 0){

                minValue = arr[i];
                maxValue = arr[i];

            }else{

                if (arr[i] < minValue){

                    minValue = arr[i];

                }else if (arr[i] > maxValue){

                    maxValue = arr[i];

                }

            }

        }

        System.out.println("En büyük değer " + maxValue + " en küçük değer " + minValue);

    }

    public static void nearestMinMaxValue(int[] list , int value) {

        int minValue = value, maxValue = value;

        Arrays.sort(list);

        for (int i : list){

            if (i < value){

                minValue = i;

            }
            if (i > value){

                maxValue = i;
                break;
            }

        }
        System.out.println(Arrays.toString(list));
        System.out.println(value + " değerine en yakın en küçük değer " + minValue + " en yakın en büyük değer " + maxValue);

    }
}
