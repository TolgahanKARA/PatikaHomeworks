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

}
