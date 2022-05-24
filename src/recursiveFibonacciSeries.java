import java.util.Scanner;

public class recursiveFibonacciSeries {

    static int recursiveFibonacci(int i){

        if(i == 0){

            return 0;

        }
        if (i == 1){

            return 1;

        }
        return recursiveFibonacci(i-1) + recursiveFibonacci(i-2);

    }

    public static void main(String[] args) {

        int n, temp = 0, tempT = 1, gecici= 0;

        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();

        for (int i = 0; i <= n; i++){

            if (gecici == 0){

                System.out.print(temp + " ");
                gecici = temp + tempT;
                temp = tempT;
                tempT = gecici;

            }else {

                gecici = temp + tempT;
                System.out.print(temp + " ");
                temp = tempT;
                tempT = gecici;

            }



        }

        System.out.println("\nrecusive olarak çağırılan fibonacci dizisi");

        for (int i = 0; i <= n; i++){

            System.out.print(recursiveFibonacci(i) + " ");

        }

    }

}
