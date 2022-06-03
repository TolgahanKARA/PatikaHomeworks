package numberGuesingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd;
        Scanner scn;
        int randomNumber;
        int inputNumber;
        int life = 0;
        boolean isWrong = true;

        rnd = new Random();
        randomNumber = rnd.nextInt(100);

        System.out.print("Bir sayı giriniz : ");
        scn = new Scanner(System.in);

        while (life < 5){

            if (life >= 1){

                System.out.print((life+1) + ". denemeniz kalan hakkınız " + (5-life) + " Bir sayı giriniz : " );

            }

            inputNumber = scn.nextInt();

            if (inputNumber < 0 || inputNumber > 99){

                if (isWrong) {

                    System.out.println("Hatalı giriş yaptınız girdiniz " + inputNumber + " birden çok hatalı giriş yaparsanız hakkınız gidecek.");
                    isWrong=false;

                }else {

                    System.out.println("Çok fazla hatalı giriş yaptınız girdiniz " + inputNumber + " bir canınız gitti.");
                    life++;

                }

            }else{

                if (inputNumber < randomNumber){

                    System.out.println("Girdiğiniz sayı üretilen sayıdan küçük bir hakkınız azaldı.");
                    life++;
                    continue;

                }else if(inputNumber > randomNumber){

                    System.out.println("Girdiğiniz sayı üretilen sayıdan büyük bir hakkınız azaldı.");
                    life++;
                    continue;
                }else {

                    System.out.println("Girdiğiniz sayı " + inputNumber + " = " + randomNumber + " ile eşleşti tebrikler kazandınız.");
                    break;

                }

            }

        }

    }

}
