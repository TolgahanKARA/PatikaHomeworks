import java.util.Scanner;

public class sliceOfBaklava {

    public static void main(String[] args) {

        int numberOfLine;

        Scanner scn = new Scanner(System.in);

        System.out.print("Baklava diliminin kaç satır gideceğini yazınız : ");
        numberOfLine = scn.nextInt();

        for (int i = 1; i <= numberOfLine; i++){

            for (int j = 1; j <= numberOfLine-i; j++){

                System.out.print(" ");

            }
            for (int j = 1; j <= ((2*i)-1); j++){

                System.out.print("*");

            }

            System.out.println();

        }

        for (int i = numberOfLine; i >= 1 ; i--){

            for (int j = 1; j <= numberOfLine-i; j++){

                System.out.print(" ");

            }
            for (int j = 1; j <= ((2*i)-1); j++){

                System.out.print("*");

            }

            System.out.println();

        }


    }

}
