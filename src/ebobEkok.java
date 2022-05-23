import java.util.Scanner;

public class ebobEkok {

    public static void main(String[] args) {

        int numberOne, numberTwo , ebob = 0, ekok = 1;

        Scanner scn = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        numberOne = scn.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        numberTwo = scn.nextInt();

        if (numberOne < numberTwo){

            for (int i = 1; i <= numberOne; i++){

                if (numberOne % i == 0 && numberTwo % i == 0){

                    ebob = i;

                }

            }
            System.out.println("Girdiğiniz sayıların ebobu : " + ebob);
            for (int i = 1; i <= (numberOne*numberTwo); i++){

                if (i % numberOne == 0 && i % numberTwo == 0){

                    ekok = i;
                    break;

                }

            }
            System.out.println("Girdiğiniz sayıların ekobu : " + ekok);

        }else {

            for (int i = 1; i <= numberTwo; i++){

                if (numberOne % i == 0 && numberTwo % i == 0){

                    ebob = i;

                }

            }
            System.out.println("Girdiğiniz sayıların ebobu : " + ebob);

            ekok = (numberOne*numberTwo)/ebob;

            System.out.println("Girdiğiniz sayıların ekobu : " + ekok);

        }

    }

}
