import java.util.Scanner;

public class tempature {

    public static void main(String[] args) {

        int temp;

        Scanner scn = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz :");

        temp = scn.nextInt();

        if (temp<5){

            System.out.println("Bugün hava sıcaklığı " + temp + "kayak yapabilirsiniz");

        }else if (temp>=5 && temp<15){

            System.out.println("Bugün hava sıcaklığı " + temp + " sinamaya gidebilirsin");

        }else if (temp>=15 && temp<25){

            System.out.println("Bugün hava sıcaklığı " + temp + " piknik yapabilirsiniz");

        }else {

            System.out.println("Bugün hava sıcaklığı " + temp + " yüzme aktivitesine gidebilirsiniz");

        }

    }

}
