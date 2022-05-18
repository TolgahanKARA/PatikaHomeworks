import java.util.Scanner;

public class bodyMassIndex {

    public static void main(String[] args) {

        double bodySize,bodyWeight;

        Scanner scn= new Scanner(System.in);

        System.out.println("Enter your body size : ");

        bodySize = scn.nextDouble();

        System.out.println("Enter your body weight : ");

        bodyWeight = scn.nextDouble();

        System.out.println("your body mass index : " + (bodyWeight/(bodySize*bodySize)));



    }

}
