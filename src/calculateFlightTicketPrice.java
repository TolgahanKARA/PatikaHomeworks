import java.util.Scanner;

public class calculateFlightTicketPrice {

    public static void main(String[] args) {

        int km,yas,yolculukTipi;
        double tutar=0.10,toplam;


        Scanner scn = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz :");
        km = scn.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = scn.nextInt();
        System.out.println("Yolculuk tipini seçiniz :");
        yolculukTipi = scn.nextInt();

        switch (yolculukTipi){
            case 1:
                if (km<=0 && yas<0){

                    System.out.println("Km değeri yada yaş değeri sıfırdan küçük olamaz");

                }else{

                    toplam = km*tutar;

                    if(yas<12){

                        System.out.println("Toplam tutar: " + toplam/2);

                    }else if (yas>=12 && yas<=24){

                        toplam=toplam-((toplam*10)/100);

                        System.out.println("Toplam tutar: " + toplam);

                    }else if (yas>=25 && yas<65){

                        System.out.println("Toplam tutar: " + toplam);

                    }else if(yas>=65){

                        toplam=toplam-((toplam*30)/100);

                        System.out.println("Toplam tutar: " + toplam);

                    }

                }
                break;
            case 2:
                if (km<=0 && yas<0){

                    System.out.println("Km değeri yada yaş değeri sıfırdan küçük olamaz");

                }else{

                    toplam = km*tutar*2;

                    if(yas<12){

                        System.out.println("Toplam tutar: " + toplam/2);

                    }else if (yas>=12 && yas<=24){

                        toplam=toplam-((toplam*10)/100);

                        System.out.println("Toplam tutar: " + toplam);

                    }else if (yas>=25 && yas<65){

                        System.out.println("Toplam tutar: " + toplam);

                    }else if(yas>=65){

                        toplam=toplam-((toplam*30)/100);

                        System.out.println("Toplam tutar: " + toplam);

                    }

                }
                break;
            default:
                System.out.println("Girdiğiniz tipte yolculuk edemezsiniz");
                break;
        }



    }

}
