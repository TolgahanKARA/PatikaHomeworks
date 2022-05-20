import java.util.Scanner;

public class sortingSmallToLarge {

    public static void main(String[] args) {
        int a,b,c;

        Scanner scn= new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz :");
        a = scn.nextInt();

        System.out.print("2.Sayıyı giriniz :");
        b = scn.nextInt();

        System.out.print("3.Sayıyı giriniz :");
        c = scn.nextInt();

        if (a<b && a<c){

            if (b<c){

                System.out.println("en küçükten büyüğe doğru sayılar :" + a + "<" + b + "<" + c);

            }else if(c<b){

                System.out.println("en küçükten büyüğe doğru sayılar :" + a + "<" + c + "<" + b);

            }

        }else if(b<a && b<c){

            if(a<c){

                System.out.println("en küçükten büyüğe doğru sayılar :" + b + "<" + a + "<" + c);

            }else if(c<a){

                System.out.println("en küçükten büyüğe doğru sayılar :" + b + "<" + c + "<" + a);

            }

        }else {

            if (a<b){

                System.out.println("en küçükten büyüğe doğru sayılar :" + c + "<" + a + "<" + b);

            }else if(b<a){

                System.out.println("en küçükten büyüğe doğru sayılar :" + c + "<" + b + "<" + a);

            }

        }

    }
}
