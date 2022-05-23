import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {

        int inputF, sumO = 0, sumT = 1, temp;

        Scanner scn = new Scanner(System.in);

        System.out.print("Fibbonacci serisini kaç sayısına kadar gitmesini istiyorsunuz: ");
        inputF = scn.nextInt();

        for (int i = 1; i <= inputF; i++){

            temp = sumO + sumT;

            System.out.print(sumO + "-");

            sumO = sumT;
            sumT = temp;

        }

    }

}
