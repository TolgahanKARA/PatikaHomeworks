import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {

        int caunt = 0, n;

        for (int i = 2; i <= 100; i++){

            for (int k = 2; k < i; k++){

                if (i%k == 0){
                    caunt++;
                }

            }
            if (caunt==0)
                System.out.println(i);
            caunt=0;
        }
        //Girilen sayının asal olup olmadığını bulan program
        /*

        Scanner scn = new Scanner(System.in);
        n=scn.nextInt();

        for (int i = 2; i <= n; i++){

            if (n%i==0) {
                caunt++;
            }

        }
        if (caunt==1){
            System.out.println("a");
        }else
            System.out.println("d");
*/
    }

}
