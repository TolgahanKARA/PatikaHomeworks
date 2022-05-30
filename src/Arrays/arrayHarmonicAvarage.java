package Arrays;

public class arrayHarmonicAvarage {
    public static void harmonicAvarage(int[] arr) {

        int temp, tempTwo=1;
        double result = 0.0;

        for (int i = 0; i < arr.length; i++){

            temp = arr[i];

            for (int j = 1; i <= temp; j++){

                if (tempTwo == temp){

                    System.out.println(temp + "\t → sayısının harmonik seri toplamı:\t" + result);
                    tempTwo = 0;
                    break;

                }else {

                    result += (1.0/j);
                    tempTwo++;

                }

            }

        }

    }
}
