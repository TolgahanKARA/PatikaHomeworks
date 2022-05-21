import java.util.Scanner;

public class combination {

    public static void main(String[] args) {

        int fakNumber, comNum, constOne=1, constTwo=1, differenceConst=1;

        Scanner scn = new Scanner(System.in);

        System.out.print("Kombinasyon sayınızı giriniz : ");
        fakNumber = scn.nextInt();

        System.out.print("Kombinasyon sayınızın alt kısmını giriniz :");
        comNum = scn.nextInt();

        if (fakNumber < comNum){

            System.out.println(fakNumber +" in " + comNum +" kombinasyonu olamaz");

        }else {

            for (int i = 1; i<=fakNumber; i++){

                constOne = i * constOne;

            }
            for (int i = 1; i<=comNum; i++){

                constTwo = i * constTwo;

            }
            for (int i = 1; i<=(fakNumber-comNum); i++){

                differenceConst = i * differenceConst;

            }

            System.out.println(fakNumber +" in " + comNum +" kombinasyonu " + (constOne/(constTwo*differenceConst)));


        }

    }

}
