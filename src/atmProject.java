import java.util.Scanner;

public class atmProject {

    public static void main(String[] args) {

        String user, pass;
        boolean control = true, controlT = true;
        int caunt, right= 3, withdrawMoney, depositMoney, balance =1200;

        Scanner scn = new Scanner(System.in);

            while (right > 0){

                System.out.print("Kullanıcı adınızı giriniz : ");
                user = scn.nextLine();

                System.out.print("Şifrenizi giriniz : ");
                pass = scn.nextLine();

                if (user.equals("Tolgahan") && pass.equals("KARA")){

                    System.out.println("Yapmak istediğiniz işlemi seçiniz : " +
                            "\n 1-Para Çekme " +
                            "\n 2-Para Yatırma " +
                            "\n 3-Bakiye Sorgulama " +
                            "\n 4-Kart İade");


                    while (control){
                        caunt = scn.nextInt();
                        switch (caunt){

                            case 1:

                                while (controlT){
                                    System.out.print("Çekmek istediğiniz değeri giriniz :");
                                    withdrawMoney = scn.nextInt();

                                    if (withdrawMoney <= 1200){

                                        System.out.println(withdrawMoney + " para çektiniz kalan paranız " + (balance-withdrawMoney));
                                        controlT=false;
                                        break;

                                    }else{

                                        System.out.println("Hesabınızda " + balance + " var " + balance + " değerinden küçük değer girin");

                                    }

                                }
                                control = false;

                                break;
                            case 2:

                                System.out.print("Yatırmak istediğiniz para tutarını giriniz :");
                                depositMoney = scn.nextInt();
                                System.out.println("Hesabınıza "+ depositMoney +" para yatırdınız güncel paranız " + (depositMoney+balance));
                                control = false;

                                break;
                            case 3:

                                System.out.println("Bakiyenizde " + balance + " tutar bulunmaktadır");
                                control = false;

                                break;
                            case 4:

                                System.out.println("Bankamıza yeniden bekleriz");
                                control = false;
                                break;
                            default:
                                System.out.println("Yanlış bir tuşlama yaptınız");

                        }

                    }

                }else {

                        right--;

                    }

                }
        System.out.println("Kartınız bloke olmuştur " + (right+3) + " kere yanlış girdiniz");

    }

}


