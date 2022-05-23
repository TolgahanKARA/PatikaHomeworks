import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {

        int perfectNumber, sum = 0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        perfectNumber = scn.nextInt();

        for (int i = 1; i <= (perfectNumber-1); i++){

            if (perfectNumber % i == 0){

                sum = sum+i;

            }

        }

        if(perfectNumber == sum)
            System.out.println(sum + " sayısı bir mükemmel sayıdır");
        else
            System.out.println(sum + " sayısı bir mükemmel sayıdır değildir");
    }

}
