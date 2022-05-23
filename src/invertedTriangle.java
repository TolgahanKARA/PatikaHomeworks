import java.util.Scanner;

public class invertedTriangle {

    public static void main(String[] args) {

        int numberOfLine;

        Scanner scn = new Scanner(System.in);

        System.out.print("Ters üçgenin satır sayısını giriniz: ");
        numberOfLine = scn.nextInt();

        for (int i = numberOfLine; i >= 0; i--){

            for (int j = 1; j <= ((2*i)-1); j++){

                System.out.print("*");

            }
            System.out.println();
            for (int j = 0; j <= numberOfLine-i; j++){

                System.out.print(" ");

            }

        }

    }

}
