import java.util.Scanner;

public class minMaxValue {

    public static void main(String[] args) {

        int enterValue, min = 0, max = 0, choiceValue;
        boolean value = true;

        Scanner scn = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceğinizi seçiniz : ");
        choiceValue = scn.nextInt();

        while (value){

            if (choiceValue > 0){

                for (int i = 1; i <= choiceValue; i++ ){

                    System.out.println(i + ". değerinizi giriniz:");
                    enterValue = scn.nextInt();

                    if (enterValue < min){

                        min = enterValue;

                    }

                    if (enterValue > max){

                        max = enterValue;

                    }

                }

                System.out.println("Girilen en büyük değer " + max + " girilen en küçük değer " + min + " sayılarıdır");

                choiceValue=0;

            }else
                break;

        }

    }

}
