package AdventureGames;

public class Weapon {

    private String weaponName;
    private int id;
    private int damage;
    private int price;

    public Weapon(String weaponName, int id, int damage, int price) {

        this.weaponName = weaponName;
        this.id = id;
        this.damage = damage;
        this.price = price;

    }

    public static Weapon[] weapons() {

        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Tabanca", 1, 2, 10);
        weaponList[1] = new Weapon("Kılıç", 2, 3, 35);
        weaponList[2] = new Weapon("Tüfek", 3, 7, 45);

        return weaponList;

    }

    public static Weapon getWeaponObjByID(int selectActions) {

        for (Weapon weapons: Weapon.weapons()){

            if (weapons.getId() == selectActions){

                return weapons;

            }

        }
        return null;

    }


    public String getWeaponName(){

        return this.weaponName;

    }

    public void setWeaponName(String weaponName){

        this.weaponName = weaponName;

    }

    public int getId(){

        return this.id;

    }

    public void setId(int id){

        this.id = id;

    }

    public int getDamage(){

        return this.damage;

    }

    public void setDamage(int damage){

        this.damage = damage;

    }

    public int getPrice(){

        return this.price;

    }

    public void setPrice(int price){

        this.price = price;

    }
}
