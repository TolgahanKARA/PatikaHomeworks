import java.util.Scanner;

public class oddNumber {

    public static void main(String[] args) {

        int inputN, sum=0;
        boolean keepGoing = true;

        Scanner scn = new Scanner(System.in);

        while (keepGoing){

            inputN = scn.nextInt();
            if (inputN % 2 != 0){

                System.out.println("Girdiğiniz sayıların toplamı : " + sum);
                keepGoing=false;
                break;

            }else {

                if (inputN %2 == 0 && inputN %4 == 0){

                    sum=sum + inputN;

                }

            }

        }




    }

}
