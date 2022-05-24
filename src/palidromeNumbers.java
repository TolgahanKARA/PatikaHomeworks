import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class palidromeNumbers {

    static boolean isPolidrome(int n){

        int temp, reverseNumber = 0, lastNumber;

        temp = n;

        while (temp != 0){

            lastNumber = temp % 10;

            reverseNumber = (reverseNumber * 10) +lastNumber;

            temp = temp / 10;

        }

        if (n == reverseNumber){

            System.out.println(n + " Sayısı polidrom bir sayıdır");
            return true;

        }else {

            System.out.println(n+ " Sayısı polidrom bir sayı değildir");
            return false;

        }



    }

    public static void main(String[] args) {

        int number;

        Scanner scn = new Scanner(System.in);

        number = scn.nextInt();

        isPolidrome(number);


    }

}
