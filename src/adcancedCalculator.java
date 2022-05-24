import java.util.Scanner;

public class adcancedCalculator {

    public static Scanner scn = new Scanner(System.in);
    public static int numOne, numTwo, result;
    public static boolean durum = true;

    public static void sum(){

        System.out.println("Birinci sayıyı giriniz : ");
        numOne = scn.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        numTwo = scn.nextInt();

        System.out.println("Sayıların toplamı : " + (result = numOne + numTwo));


    }

    public static void minus(){

        System.out.println("Birinci sayıyı giriniz : ");
        numOne = scn.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        numTwo = scn.nextInt();

        System.out.println("Sayıların farkı : " + (result = numOne - numTwo));

    }

    public static void times(){

        System.out.println("Birinci sayıyı giriniz : ");
        numOne = scn.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        numTwo = scn.nextInt();

        System.out.println("Sayıların çarpımı : " + (result = numOne * numTwo));

    }

    public static void divided(){

        while (durum){

            System.out.println("Birinci sayıyı giriniz : ");
            numOne = scn.nextInt();
            System.out.println("İkinci sayıyı giriniz : ");
            numTwo = scn.nextInt();

            if (numOne != 0){

                System.out.println("Sayıların birbirine bölümü : " + (result = numOne / numTwo));
                durum = false;
                break;

            }else{

                System.out.println("Birinci sayının değeri " + numOne + "\n");

            }

        }

    }

    public static void power(){

        System.out.println("Üstünün alınması istediğiniz sayıyı giriniz : ");
        numOne = scn.nextInt();
        System.out.println("Sayının üsünü giriniz : ");
        numTwo = scn.nextInt();

        result = 1;

        for (int i = 1; i <= numTwo ; i++){

            result = result * numOne;

        }

        System.out.println(numOne + "üzeri" + numTwo + "sayısının sonucu :" + result);

    }

    public static void factorial(){

        System.out.println("Faktoriyelinin hesaplanmasını istediğiniz sayıyı giriniz : ");
        numOne = scn.nextInt();

        result = 1;

        for (int i = 1; i <= numOne ; i++){

            result = result * i;

        }

        System.out.println(numOne + " sayısının faktoriyeli : " + result);

    }

    public static void modding(){

        System.out.println("Modunun alınması istediğiniz sayıyı giriniz : ");
        numOne = scn.nextInt();
        System.out.println(numOne + " Sayısının kaça göre modunun alınacağını giriniz : ");
        numTwo = scn.nextInt();

        result = numOne % numTwo;

        System.out.println(numOne + " Sayısının " + numTwo + " sayısına göre modu " + result);

    }

    public static void areaAndEnviroment(){

        System.out.println("Dikdörtgenin birinci kenar uzunluğunu giriniz : ");
        numOne = scn.nextInt();
        System.out.println("Dikdörtgenin ikinci kenar uzunluğunu giriniz : ");
        numTwo = scn.nextInt();

        area(numOne,numTwo);
        enviroment(numOne,numTwo);

    }

    public static void area(int i, int j){

        result = i*j ;

        System.out.println("Dikdörtgenin alanı : " + result);

    }

    public static void enviroment(int i, int j){

        result = 2 * (i+j);

        System.out.println("Dikdörtgenin çevresi : " + result);

    }

    public static void exit(){

        String chouse;

        while (durum){

            chouse = scn.nextLine();

            if (chouse.equals("y")){

                durum = false;
                System.out.println("Hesap makinesinden çıkış işlemi yaptınız");
                break;

            }else {

                System.out.println("Çıkmak istediğinize emin misiniz Y/N");

            }

        }

    }

    public static void main(String[] args) {

        int select;


        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do{
            System.out.println(menu);
            select = scn.nextInt();

            switch (select){

                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    areaAndEnviroment();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Hesap makinesinin fonksiyonlarından seçmediniz bir kez daha seçiniz");

            }

        }while (select !=0);

    }

}
