package AdventureGames;

public class Toolstore extends NormalLocations {

    private int selectActions;
    private int selectActionsWeapon;
    private int selectActionsArmor;
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
        System.out.println("--------\t1-Menü\t--------");
        System.out.println("--------\t2-Çıkış\t--------");
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

            System.out.println(weapon.getId() + " - "
                    + "\tİsmi\t:\t" + weapon.getWeaponName()
                    + "\tHasarı\t:\t" + weapon.getDamage()
                    + "\tFiyatı\t:\t" + weapon.getPrice());

        }

        System.out.println("4\tÇıkış");

        selectActionsWeapon = Locations.scanner.nextInt();
        while (selectActionsWeapon < 1 || selectActionsWeapon > Weapon.weapons().length + 1) {

            System.out.println("Hatalı bir değer girdiniz ");
            selectActionsWeapon = Locations.scanner.nextInt();

        }

        switch (selectActionsWeapon) {

            case 1:
                buy(selectActionsWeapon);
                break;
            case 2:
                buy(selectActionsWeapon);
                break;
            case 3:
                buy(selectActionsWeapon);
                break;
            case 4:
                exit();
                break;

        }

    }

    private void selectArmors() {

        System.out.println("---------\tZırhlar \t---------");
        System.out.println();
        for (Armor armors: Armor.armors()){

            System.out.println(armors.getId() + " - "
                    + "\tİsmi\t:\t" + armors.getArmorName()
                    + "\tBlock\t:\t" + armors.getBlock()
                    + "\tFiyatı\t:\t" + armors.getPrice());

        }

        System.out.println("4 - \tÇıkış");

        selectActionsArmor = Locations.scanner.nextInt();
        while (selectActionsArmor < 1 || selectActionsArmor > Armor.armors().length +1){

            System.out.println("Hatalı bir değer girdiniz !");
            selectActionsArmor = Locations.scanner.nextInt();

        }

        switch (selectActionsArmor){

            case 1:
                buy(selectActionsArmor);
                break;
            case 2:
                buy(selectActionsArmor);
                break;
            case 3:
                buy(selectActionsArmor);
                break;
            case 4:
                buy(selectActionsArmor);
                break;
            default:
                exit();
                break;

        }

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

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectActionsWeapon);

        Armor selectedArmor = Armor.getArmorObjByID(selectActionsArmor);


        if (selectedWeapon != null){

            if (selectedWeapon.getPrice() <= this.getPlayer().getMoney()){

                System.out.println(selectedWeapon.getWeaponName() + " silahını satın aldınız");
                balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Tebrikler silah satın aldınız");
                System.out.println("Kalan paranız :\t" + this.getPlayer().getMoney());
                System.out.println("Önceki silahınız :\t" + this.getPlayer().getInventory().getWeapon().getWeaponName());

                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Şimdiki silahınız :\t" + this.getPlayer().getInventory().getWeapon().getWeaponName());
            }else{

                System.out.println("Yeterli paranız bulunmamaktadır");

            }

        }
        if (selectedArmor != null){

            if (selectedArmor.getPrice() <= this.getPlayer().getMoney()){

                System.out.println(selectedArmor.getArmorName() + " zırhını aldınız");
                balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Tebrikler zırh satın aldınız");
                System.out.println("Kalan paranız :\t" + this.getPlayer().getMoney());
                System.out.println("Önceki zırhınız :\t" + this.getPlayer().getInventory().getArmor().getArmorName());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                System.out.println("Şimdiki zırhınız :\t" + this.getPlayer().getInventory().getArmor().getArmorName());

            }else{

                System.out.println("Yeterli paranız bulunmamaktadır");

            }

        }

    }

}
