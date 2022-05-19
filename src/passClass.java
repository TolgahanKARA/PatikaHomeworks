import java.util.Scanner;

public class passClass {

    public static void main(String[] args) {

        int mat,fiz,tur,kim,mzk,ort = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Sırası ile notlarınızı giriniz :");

        System.out.println("Matematik notunuz : ");
        mat= scn.nextInt();
        
        if (mat>=0 && mat<=100){
            
            ort=mat+ort;
            
        }else{

            System.out.println("Girdiğiniz ders notu geçersiz ortalamaya kattılmaz");

        }

        System.out.println("Fizik notunuz : ");
        fiz= scn.nextInt();

        if (fiz>=0 && fiz<=100){

            ort=fiz+ort;

        }else{

            System.out.println("Girdiğiniz ders notu geçersiz ortalamaya kattılmaz");

        }

        System.out.println("Türkçe notunuz : ");
        tur= scn.nextInt();

        if (tur>=0 && tur<=100){

            ort=tur+ort;

        }else{

            System.out.println("Girdiğiniz ders notu geçersiz ortalamaya kattılmaz");

        }

        System.out.println("Kimya notunuz : ");
        kim= scn.nextInt();

        if (kim>=0 && kim<=100){

            ort=kim+ort;

        }else{

            System.out.println("Girdiğiniz ders notu geçersiz ortalamaya kattılmaz");

        }

        System.out.println("Müzik notunuz : ");
        mzk= scn.nextInt();

        if (mzk>=0 && mzk<=100){

            ort=mzk+ort;

        }else{

            System.out.println("Girdiğiniz ders notu geçersiz ortalamaya kattılmaz");

        }

        System.out.println("Derslernizin ortalaması : " + (ort/5));
    }
}
