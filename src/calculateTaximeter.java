import java.util.Scanner;

public class calculateTaximeter {

    public static void main(String[] args) {

        double perKilometer,price=2.20,minPrice=20.0,openingTaximeter=10.0;

        Scanner scn = new Scanner(System.in);

        perKilometer= scn.nextDouble();

        if (perKilometer<4.54){

            System.out.println("Gittiğiniz mesafe kısa mesafedir tarife ücreti : "+ minPrice);

        }else{

            System.out.println("Gittiğiniz mesafe ücreti : " + perKilometer*price);

        }


    }

}
