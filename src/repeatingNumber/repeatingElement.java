package repeatingNumber;

public class repeatingElement {

    static int isRepeat = 1, isArrayFirst;


    public static void repeat(int[] arr) {

        isArrayFirst = arr[0];
        isArrayFirst -= 1;

        for (int i = 0; i < arr.length; i++){

            if (arr[i]!=isArrayFirst){

                for (int j = 0; j < arr.length; j++){

                    if ((i!=j) && (arr[i] == arr [j])){

                        isRepeat++;
                        isArrayFirst = arr[i];

                    }

                }

                System.out.println(arr[i] +" sayısı " + isRepeat + " kere tekrar edildi.");
                isRepeat=1;

            }

        }

    }
}
