package palidromicWord;

import java.util.Scanner;

public class Main {

    static Scanner scn;
    static String isFoundString;
    static char [] character;

    public static void main(String[] args) {

        System.out.print("Bir kelime giriniz : ");
        scn = new Scanner(System.in);
        isFoundString = scn.nextLine();

        character = isFoundString.toCharArray();

        for (int i = 0; i <= isFoundString.length()-1; i++){

            if (character[i] == character[(isFoundString.length()-1)-i]){

                System.out.println("Girdiğiniz kelime palidromdur.");
                break;

            }else {

                System.out.println("Girdiğiniz kelime palidrom değildir.");
                break;

            }

        }

    }

}
