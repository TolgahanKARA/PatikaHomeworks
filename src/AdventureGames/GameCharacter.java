package AdventureGames;

public abstract class GameCharacter {

    private int id;
    private int damage;
    private int health;
    private int money;
    private String typeOfCharacter;

    public GameCharacter(int id, int damage, int health, int money, String typeOfCharacter) {

        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.typeOfCharacter = typeOfCharacter;

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

    public int getHealth(){

        return this.health;

    }

    public void setHealth(int health){

        this.health = health;

    }

    public int getMoney(){

        return this.money;

    }

    public void setMoney(int money){

        this.money = money;

    }

    public String getTypeOfCharacter(){

        return this.typeOfCharacter;

    }

    public void setTypeOfCharacter(String typeOfCharacter){

        this.typeOfCharacter = typeOfCharacter;

    }

}
