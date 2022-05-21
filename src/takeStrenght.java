import java.util.Scanner;

public class takeStrenght {

    public static void main(String[] args) {

        int topNumber, fixedNumber, startNumber=1;

        Scanner scn = new Scanner(System.in);

        System.out.print("üstü alınacak sayıyı giriniz :");
        fixedNumber = scn.nextInt();

        System.out.print("Üstü alınacak sayının üstünü giriniz :");
        topNumber = scn.nextInt();

        for (int i =1; i<=topNumber; i++){

            startNumber = startNumber*fixedNumber;

        }

        System.out.println("Girdiğiniz değerlere göre sayınız : "+startNumber);



    }

}
