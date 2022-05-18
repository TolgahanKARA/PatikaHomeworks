import java.util.Scanner;

public class groceryStoreProgram {

    public static void main(String[] args) {

        double  pearKgP=2.14,appleKgP=3.67,tomatoesKgP=1.11,bananaKgP=0.95,aubergineKgP=5.0,total, aKg,pKg,tKg,bKg,avbKg;

        Scanner scn= new Scanner(System.in);

        System.out.print("enter kilogram of apples : ");
        aKg=scn.nextDouble();
        System.out.print("\nenter kilogram of pear : ");
        pKg=scn.nextDouble();
        System.out.print("\nenter kilogram of tomatoes : ");
        tKg=scn.nextDouble();
        System.out.print("\nenter kilogram of banana : ");
        bKg=scn.nextDouble();
        System.out.print("\nenter kilogram of eggplant : ");
        avbKg=scn.nextDouble();

        if(aKg<0){

            System.out.println("kilogram of apple cannot be less than zero");

        }else if(aKg>=0){

            System.out.println(aKg + " :you bought a kilo of apples " + appleKgP*aKg +" is the price of your reputation.");

        }
        if(pKg<0){

            System.out.println("kilogram of pear cannot be less than zero");

        }else if(pKg>=0){

            System.out.println(pKg + " :you bought a kilo of pear " + pearKgP*pKg +" is the price of your reputation.");

        }
        if(tKg<0){

            System.out.println("kilogram of tomato cannot be less than zero");

        }else if(tKg>=0){

            System.out.println(pKg + " :you bought a kilo of tomato " + tomatoesKgP*tKg +" is the price of your reputation.");

        }
        if(bKg<0){

            System.out.println("kilogram of banana cannot be less than zero");

        }else if(bKg>=0){

            System.out.println(pKg + " :you bought a kilo of banana " + bananaKgP*bKg +" is the price of your reputation.");

        }
        if(avbKg<0){

            System.out.println("kilogram of aubergine cannot be less than zero");

        }else if(avbKg>=0){

            System.out.println(pKg + " :you bought a kilo of aubergine " + aubergineKgP*aKg +" is the price of your reputation.");

        }
        System.out.println("Total price : " + ((appleKgP*aKg)+(pearKgP*pKg)+(tomatoesKgP*tKg)+(bananaKgP*bKg)+(aubergineKgP*aKg)));

    }

}
