import java.util.Scanner;

public class switchCaseCalculator {

    public static void main(String[] args) {

        double  n1,n2,result;
        int select;

        Scanner scn = new Scanner(System.in);

        System.out.println("Lütfen seçimizi giriniz : ");

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");

        select = scn.nextInt();

        System.out.println("1.Sayınızı giriniz :");
        n1 = scn.nextDouble();
        System.out.println("2.Sayınızı giriniz :");
        n2 = scn.nextDouble();

        switch(select){
            case 1:
                System.out.println("Toplama işlemini seçtiniz : 1.sayınız : " + n1 + " 2.sayınız : " + n2 + ":"+n1+"+"+n2 +"işleminizin sonucu : " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemini seçtiniz : 1.sayınız : " + n1 + " 2.sayınız : " + n2 + ":"+n1+"-"+n2 +"işleminizin sonucu : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işlemini seçtiniz : 1.sayınız : " + n1 + " 2.sayınız : " + n2 + ":"+n1+"*"+n2 +"işleminizin sonucu : " + (n1*n2));
                break;
            case 4:
                switch ((int)n2) {
                    case 0:
                        System.out.println("2. sayınız "+n2+" olamaz");
                        break;
                    default:
                        System.out.println("Bölme işlemini seçtiniz : 1.sayınız : " + n1 + " 2.sayınız : " + n2 + ":" + n1 + "/" + n2 + "işleminizin sonucu : " + (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.println("Hesap makinesi işlemlerinden seçmediniz");
                break;
        }

    }

}
