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

}
