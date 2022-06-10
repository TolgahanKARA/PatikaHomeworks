package AdventureGames;

public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private boolean water;
    private boolean food;
    private boolean firewood;

    public Inventory(){

        this.weapon = new Weapon("Yumruk",0,0,0);
        this.armor = new Armor("Zırh Yok",0,0,0);
        this.water = true;
        this.food = true;
        this.firewood= true;

    }

    public Weapon getWeapon(){

        return this.weapon;

    }

    public void setWeapon(Weapon weapon){

        this.weapon = weapon;

    }

    public Armor getArmor(){

        return this.armor;

    }

    public void setArmor(Armor armor){

        this.armor = armor;

    }

    public boolean getWater(){

        return this.water;

    }

    public void setWater(boolean water){

        this.water = water;

    }

    public boolean getFood(){

        return this.food;

    }

    public void setFood(boolean food){

        this.food = food;

    }

    public boolean getFirewood(){

        return this.firewood;

    }

    public void setFirewood(boolean firewood){

        this.firewood = firewood;

    }

}
