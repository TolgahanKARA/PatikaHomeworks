package AdventureGames;

public class Toolstore extends NormalLocations {

    private int selectActions;
    private String selectExit;
    private boolean exit = true;
    private int balance;

    public Toolstore(Player player) {

        super(player, "Mağaza");

    }

    @Override
    public boolean onLocation() {

        System.out.println();
        System.out.println("Şu an mağazadasınız ekipmanlarınızı geliştirebilirsiniz !");
        System.out.println();
        System.out.println("Yapmak istediğiniz şleminizi giriniz");
        System.out.println();
        System.out.println("-------- 1-Menü --------");
        System.out.println("-------- 2-Çıkış --------");
        selectActions = Locations.scanner.nextInt();
        while (selectActions < 1 || selectActions > 2) {

            selectActions = Locations.scanner.nextInt();
            System.out.println("Hatalı bir seçim yaptınız seçiminizi tekrar yapınız");

        }
        switch (selectActions) {

            case 1:
                menu();
                break;
            case 2:
                exit();
                break;
            default:
                break;

        }

        return true;

    }

    public void menu() {

        System.out.println("--------- MENU ---------");

        System.out.println();

        System.out.println("---------\t1-Silahlar \t--------- ");
        System.out.println("---------\t2-Zırhlar \t--------- ");
        System.out.println("---------\t3-Çıkış \t--------- ");

        System.out.println();

        selectActions = Locations.scanner.nextInt();
        if (selectActions < 1 || selectActions > 3) {

            System.out.println("Hatalı giriş yaptınız");

        }


        switch (selectActions) {

            case 1:
                selectWeapon();
                break;
            case 2:
                selectArmors();
                break;
            case 3:
                exit();
                break;


        }

    }

    private void selectWeapon() {

        System.out.println("---------\tSilahlar \t---------");
        System.out.println();
        for (Weapon weapon : Weapon.weapons()) {

            System.out.println(weapon.getId()
                    + "\tİsmi\t:\t" + weapon.getWeaponName()
                    + "\tHasarı\t:\t" + weapon.getDamage()
                    + "\tFiyatı\t:\t" + weapon.getPrice());

        }

        System.out.println("4\tÇıkış");

        selectActions = Locations.scanner.nextInt();
        while (selectActions < 1 || selectActions > Weapon.weapons().length + 1) {

            System.out.println("Hatalı bir değer girdiniz ");
            selectActions = Locations.scanner.nextInt();

        }

        switch (selectActions) {

            case 1:
                buy(selectActions);
                break;
            case 2:
                buy(selectActions);
                break;
            case 3:
                buy(selectActions);
                break;
            case 4:
                exit();
                break;

        }

    }

    private void selectArmors() {

        System.out.println("---------\tZırhlar \t---------");

    }

    public void exit() {

        System.out.println("Çıkmak istediğinize emin misiniz Y / N");
        selectExit = Locations.scanner.nextLine();

        while (exit) {

            selectExit = Locations.scanner.nextLine();

            switch (selectExit) {

                case "Y":
                    System.out.println("Mağazamıza yine bekleriz");
                    exit = false;
                    break;
                case "N":
                    menu();
                    exit = true;
                    break;
                default:
                    menu();
                    exit = true;
                    break;

            }

        }


    }

    public void buy(int selectActions) {

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectActions);

        if (selectedWeapon != null){

            if (selectedWeapon.getPrice() < this.getPlayer().getMoney()){

                System.out.println(selectedWeapon.getWeaponName() + " silahını satın aldınız");
                balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız :\t" + this.getPlayer().getMoney());
                System.out.println("Önceki silahınız :\t" + this.getPlayer().getInventory().getWeapon().getWeaponName());

                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Şimdiki silahınız :\t" + this.getPlayer().getInventory().getWeapon().getWeaponName());
            }else{

                System.out.println("Yeterli paranız bulunmamaktadır");

            }

        }

    }

}
