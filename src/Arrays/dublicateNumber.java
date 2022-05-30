package Arrays;

import java.util.Arrays;

public class dublicateNumber {
    public static void dublicate(int[] list) {

        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j])) {

                    dublicate[startIndex++] = list[i];
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(dublicate));


    }

}
