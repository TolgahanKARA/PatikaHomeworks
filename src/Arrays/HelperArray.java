package Arrays;

public class HelperArray {

    public static void  print(int[ ] arr){

        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);

        }

    }

    public static int[] filled( int [ ] arr,int startIndex, int endIndex, int value){

        for (int i = 0; i < arr.length; i++){

            if (i== startIndex){

                arr[i]=value;
                startIndex++;
                if (startIndex == endIndex){

                    arr[i+1]=value;
                    break;

                }else{

                    continue;

                }

            }

        }

        return arr;

    }

    public static int find(int arr []){

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == 2){

                return i;

            }

        }

        return 0;

    }

    public static int [] copy(int arr [], int copyLength){

        int [] copy = new int[copyLength];

        for (int i = 0; i < copyLength; i++){

            copy[i] = arr[i];

        }

        return copy;

    }

    public static int [] copyRange(int arr [], int startIndex, int endIndex){

        int [] copy = new int[(endIndex-startIndex)+1];
        int temp = startIndex;

        for (int i = 0; i < arr.length; i++){

            if (temp == i){

                copy[i-startIndex]= arr[i];
                temp++;
                if (endIndex == temp){

                    copy[(i-startIndex)+1] = arr[i+1];
                    break;
                }

            }



        }

        return copy;

    }

    public static boolean equals(int [] arrO, int [] arrT){

        if (arrO.length != arrT.length){

            return false;

        }else{

            for (int i = 0; i < arrO.length; i++){

                if (arrO[i] == arrT[i]){

                    continue;

                }else {

                    return false;

                }

            }

            return true;

        }

    }

    public static double average(int[] numbers) {

        double avg;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){

            sum += numbers[i];

        }

        avg = sum / (double)numbers.length;


        return avg;
    }
}
