import java.util.Scanner;

public class recursivePrimeNumber {

    public static boolean primeN(int i, int j){

        if (j < i){

            if (i % j != 0){

                return primeN(i,++j);

            }else{

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int number = scn.nextInt();
        int caunt = 0;

        for (int i = 2; i <= number; i++){

            if (number%i ==0){
                caunt++;
            }

        }
        if (caunt==1){
            System.out.println("evet");
        }else{
            System.out.println("hayır");
        }

        if(primeN(number,2)) {

            System.out.println("evet");

        }else{

            System.out.println("hayır");

        }

    }

}
