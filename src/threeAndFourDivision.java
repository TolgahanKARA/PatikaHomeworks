import java.util.Scanner;

public class threeAndFourDivision {

    public static void main(String[] args) {

        int input, sum = 0, caunt = -1;

        System.out.print("Bir sayı giriniz : ");
        Scanner scn = new Scanner(System.in);

        input = scn.nextInt();

        for (int i = 0; i <= input; i++){

            if (i%3==0 && i%4==0){
                caunt++;
                sum+=sum+i;

            }

        }

        System.out.println("Girdiğiniz " + input + " sayısının 3 ve 4 e tam bölünenlerin toplamı : "+ sum + " ortalaması : " +(sum/caunt));
    }

}
