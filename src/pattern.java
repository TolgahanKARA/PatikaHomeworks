import java.util.Scanner;

public class pattern {

    public static int temp = 0;

    public static int patternN(int number, int decrese , int caunt , boolean t){

        if (number > 0 && t == true){

            caunt++;
            System.out.print(number + " ");
            number -= decrese;
            return patternN(number,decrese,caunt,t);

        }else {

            if (caunt > 0){

                t = false;
                caunt--;
                System.out.print(number + " ");
                number += decrese;
                return patternN(number,decrese,caunt,t);

            } else {

                return number;

            }

        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Başlangıç sayı giriniz: ");

        int number = scn.nextInt();

        for (int i = number; i >= 0; i-=5){

            System.out.print(i + " ");
            if (i == 0){

                temp = i+5;

            }
            if(i == 1 || i == 2 || i == 3 || i == 4){

                temp = i-5;

            }

        }
        for (int i = temp; i <= number; i+=5){

            System.out.print(i + " ");

        }
        System.out.println("\n--------------");

        System.out.print(number + " sayısını kaçar kaçar azaltmak istersiniz: ");
        int decsNumber = scn.nextInt();

        System.out.println(patternN(number , decsNumber, 0, true));

    }

}
