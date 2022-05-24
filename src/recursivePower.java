import java.util.Scanner;

public class recursivePower {

    public static int result = 1 ;

    public static int power(int i, int j){

        result = result * i;

        switch (j){

            case 0:
                return result;
            default:
                return power(i,(j-1));

        }



    }

    public static void main(String[] args) {

        int baseValue, powerValue;

        Scanner scn = new Scanner(System.in);

        System.out.println("Taban değeri giriniz: ");
        baseValue = scn.nextInt();
        System.out.println("Üs değerini giriniz: ");
        powerValue = scn.nextInt();

        System.out.println("\n"+ baseValue + " sayısının " + powerValue +" üstü: " + power(baseValue, (powerValue-1)));

    }

}
