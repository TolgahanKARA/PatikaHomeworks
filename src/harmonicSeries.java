import java.util.Scanner;

public class harmonicSeries {

    public static void main(String[] args) {

        int harmonicNumber;
        double sum=0.0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Harmonik seri için bir sayı giriniz :");
        harmonicNumber = scn.nextInt();

        for (int i= 1; i<= harmonicNumber; i++){



            sum= (sum + (1.0/i));

        }
        System.out.println(sum);



    }

}
