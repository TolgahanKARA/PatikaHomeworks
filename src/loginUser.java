import java.util.Scanner;

public class loginUser {

    public static void main(String[] args) {

        String user,pass,npass,y;

        Scanner scn= new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        user = scn.nextLine();

        if (user.equals("Tolgahan")){

            System.out.println("Kullanıcı isimini doğru girdiniz");

        }

        System.out.println("Kullanıcı şifrenizi giriniz : ");
        pass = scn.nextLine();

        if(pass.equals("KARA")){

            System.out.println("Şifrenizi doğru girdiniz ve sisteme giriş yaptınız");

        }else {

            System.out.println("Şifrenizi yanlış girdiniz Şifrenizi sıfırlamak ister misiniz Y/N?");

            y = scn.nextLine();

            if (y.equals("y")){

                System.out.print("Yeni şifrenizi giriniz :");
                npass = scn.nextLine();
                pass="KARA";

                if (npass.equals(pass)){

                    System.out.println("Yeni şifreniz ile eski şifreniz bir olamaz lütfen yeni bir şifre giriniz ");

                }else{

                    System.out.println("Yeni şifreniz " + npass);

                }
            }else{

                System.out.println("Şifrenizi değiştirmek istemediniz");

            }

        }

    }

}
