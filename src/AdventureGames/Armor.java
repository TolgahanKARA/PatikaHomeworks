package AdventureGames;

public class Armor {

    private String armorName;
    private int id;
    private int block;
    private int price;

    public Armor(String armorName, int id, int block, int price) {

        this.armorName = armorName;
        this.id = id;
        this.block = block;
        this.price = price;

    }

    public static Armor[] armors() {

        Armor[] armorList = new Armor[3];

        armorList[0] = new Armor("Hafif", 1, 1, 15);
        armorList[1] = new Armor("Orta", 2, 3, 25);
        armorList[2] = new Armor("Güçlü", 3, 5, 40);

        return armorList;

    }

    public static Armor getArmorObjByID(int selectActionsArmor) {

        for (Armor amors : Armor.armors()){

            if (amors.id == selectActionsArmor){

                return amors;

            }

        }

        return null;

    }

    public String getArmorName() {

        return this.armorName;

    }

    public void setArmorName(String armorName) {

        this.armorName = armorName;

    }

    public int getId() {

        return this.id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public int getBlock() {

        return this.block;

    }

    public void setBlock(int block) {

        this.block = block;

    }

    public int getPrice() {

        return this.price;

    }

    public void setPrice(int price) {

        this.price = price;

    }

}
