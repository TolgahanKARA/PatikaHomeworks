import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {

        int yil;

        Scanner scn = new Scanner(System.in);

        System.out.print("Yıl giriniz :");
        yil = scn.nextInt();

        if (yil%400==0){

            System.out.println(yil + " bir artık yıldır!");

        }else if (yil%4==0){

            System.out.println(yil + " bir artık yıldır!");

        }else{

            System.out.println(yil + " bir artık yıl değildir!");{

        }


        }

    }

}
