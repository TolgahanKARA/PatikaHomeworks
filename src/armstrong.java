import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        int number, digit, tenDigit, thousandDigit, tenThousandDigit, oneHundredDigit, sum= 1, temp ;
        boolean keepGoing = true;

        Scanner scn = new Scanner(System.in);

        while (keepGoing){

            System.out.print("En fazla 6 basamaklı bir sayı giriniz :");
            number = scn.nextInt();

            if (number>0 && number<=99999){

                oneHundredDigit = number%100000/10000;
                tenThousandDigit = number%10000/1000;
                thousandDigit = number%1000/100;
                tenDigit = number%100/10;
                digit = number%10;

                if (oneHundredDigit!=0){

                    for (int i =1; i<=5; i++){

                        sum = sum*oneHundredDigit;

                    }
                    temp= sum;
                    sum=1;
                    for (int i =1; i<=5; i++){

                        sum = sum*tenThousandDigit;

                    }
                    temp= temp+sum;
                    sum=1;
                    for (int i =1; i<=5; i++){

                        sum = sum*thousandDigit;

                    }
                    temp= temp+sum;
                    sum=1;
                    for (int i =1; i<=5; i++){

                        sum = sum*tenDigit;

                    }
                    temp= temp+sum;
                    sum=1;
                    for (int i =1; i<=5; i++){

                        sum = sum*digit;

                    }
                    temp= temp+sum;
                    sum=1;
                    System.out.println(temp==number ? number+" armstrong bir sayıdır":number+" armstrong bir sayı değildir");

                }else if (tenThousandDigit!=0){


                    for (int i =1; i<=4; i++){

                        sum = sum*tenThousandDigit;

                    }
                    temp= sum;
                    sum=1;
                    for (int i =1; i<=4; i++){

                        sum = sum*thousandDigit;

                    }
                    temp= temp+sum;
                    sum=1;
                    for (int i =1; i<=4; i++){

                        sum = sum*tenDigit;

                    }
                    temp= temp+sum;
                    sum=1;
                    for (int i =1; i<=4; i++){

                        sum = sum*digit;

                    }
                    temp= temp+sum;
                    sum=1;
                    System.out.println(temp==number ? number+" armstrong bir sayıdır":number+" armstrong bir sayı değildir");

                }else if (thousandDigit!=0){

                    for (int i =1; i<=3; i++){

                        sum = sum*thousandDigit;

                    }
                    temp= sum;
                    sum=1;
                    for (int i =1; i<=3; i++){

                        sum = sum*tenDigit;

                    }
                    temp= temp+sum;
                    sum=1;
                    for (int i =1; i<=3; i++){

                        sum = sum*digit;

                    }
                    temp= temp+sum;
                    sum=1;
                    System.out.println(temp==number ? number+" armstrong bir sayıdır":number+" armstrong bir sayı değildir");

                }else if (tenDigit!=0){

                    for (int i =1; i<=2; i++){

                        sum = sum*tenDigit;

                    }
                    temp= sum;
                    sum=1;
                    for (int i =1; i<=2; i++){

                        sum = sum*digit;

                    }
                    temp= temp+sum;
                    sum=1;
                    System.out.println(temp==number ? number+" armstrong bir sayıdır":number+" armstrong bir sayı değildir");

                }else if (digit!=0){


                    for (int i =1; i<=1; i++){

                        sum = sum*digit;

                    }
                    temp= sum;
                    sum=1;
                    System.out.println(temp==number ? number+" armstrong bir sayıdır":number+" armstrong bir sayı değildir");

                }

                keepGoing = false;
                break;

            }else{

                System.out.println("Girdiğiniz sayı değeri 6 basamaktan büyük yada negatif");

            }


        }

    }

}
