import java.util.Scanner;

public class findHoroscope {

    public static void main(String[] args) {
        int month, day;

        Scanner scn = new Scanner(System.in);

        System.out.println("Hangi ayda doğduğunuzu giriniz :");
        month = scn.nextInt();
        System.out.println("Ayın hangi günü doğduğunuzu giriniz :");
        day = scn.nextInt();

        if (month>0 && month<13){

            if(month == 1){

                System.out.print("Ocak ayının ");
                if (day>=1 && day<=21){

                    System.out.println(day + ". günü doğdunuz burcunuz oğlak");

                }else if(day>=22 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz kova");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 2){

                System.out.print("Şubat ayının ");
                if (day>=1 && day<=19){

                    System.out.println(day + ". günü doğdunuz burcunuz kova");

                }else if(day>=20 && day<=29){

                    System.out.println(day + ". günü doğdunuz burcunuz balık");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 3){

                System.out.print("Mart ayının ");
                if (day>=1 && day<=20){

                    System.out.println(day + ". günü doğdunuz burcunuz balık");

                }else if(day>=21 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz koç");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 4){

                System.out.print("Nisan ayının ");
                if (day>=1 && day<=20){

                    System.out.println(day + ". günü doğdunuz burcunuz koç");

                }else if(day>=21 && day<=30){

                    System.out.println(day + ". günü doğdunuz burcunuz boğa");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 5){

                System.out.print("Mayıs ayının ");
                if (day>=1 && day<=21){

                    System.out.println(day + ". günü doğdunuz burcunuz boğa");

                }else if(day>=22 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz ikizler");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 6){

                System.out.print("Haziran ayının ");
                if (day>=1 && day<=22){

                    System.out.println(day + ". günü doğdunuz burcunuz ikizler");

                }else if(day>=23 && day<=30){

                    System.out.println(day + ". günü doğdunuz burcunuz yengeç");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 7){

                System.out.print("Temmuz ayının ");
                if (day>=1 && day<=22){

                    System.out.println(day + ". günü doğdunuz burcunuz yengeç");

                }else if(day>=23 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz aslan");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 8){

                System.out.print("Ağustos ayının ");
                if (day>=1 && day<=22){

                    System.out.println(day + ". günü doğdunuz burcunuz aslan");

                }else if(day>=23 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz başak");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 9){

                System.out.print("Eylül ayının ");
                if (day>=1 && day<=22){

                    System.out.println(day + ". günü doğdunuz burcunuz başak");

                }else if(day>=23 && day<=30){

                    System.out.println(day + ". günü doğdunuz burcunuz terazi");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 10){

                System.out.print("Ekim ayının ");
                if (day>=1 && day<=22){

                    System.out.println(day + ". günü doğdunuz burcunuz terazi");

                }else if(day>=23 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz akrep");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else if(month == 11){

                System.out.print("Kasım ayının ");
                if (day>=1 && day<=21){

                    System.out.println(day + ". günü doğdunuz burcunuz akrep");

                }else if(day>=22 && day<=30){

                    System.out.println(day + ". günü doğdunuz burcunuz yay");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }else{

                System.out.print("Aralık ayının ");
                if (day>=1 && day<=21){

                    System.out.println(day + ". günü doğdunuz burcunuz yay");

                }else if(day>=22 && day<=31){

                    System.out.println(day + ". günü doğdunuz burcunuz oğlak");

                }else{

                    System.out.println(day + " diye bir günü bulunmamaktadır");

                }

            }

        }else{

            System.out.println("Böyle bir ay bulunmamaktadır.");

        }

    }
}
