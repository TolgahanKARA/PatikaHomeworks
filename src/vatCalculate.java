import java.util.Scanner;

public class vatCalculate {

    public static void main(String[] args) {

        double moneyValue;
        double vat;

        Scanner scn = new Scanner(System.in);

        moneyValue=scn.nextDouble();

        if(moneyValue<=0){

            System.out.println("Fiyat 0 dan küçük olamaz");

        }else if (moneyValue>=1000){

            vat=((moneyValue*8)/100);
            moneyValue=moneyValue+vat;
            System.out.println(moneyValue);

        }else {

            vat=((moneyValue*18)/100);
            moneyValue=moneyValue+vat;
            System.out.println(moneyValue);

        }

    }

}
