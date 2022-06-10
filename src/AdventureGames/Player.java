package AdventureGames;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String playerName;
    private String typeOfCharacter;
    private int select;
    private Scanner scanner;
    private Inventory inventory;

    public Player(String playerName) {

        this.playerName = playerName;
        this.inventory = new Inventory();

    }

    public void selectCharacter() {

        System.out.println("Karakterler");

        GameCharacter[] gameCharacters = {new Samurai(), new Archer(), new Knight()};

        for (GameCharacter gameCharacter : gameCharacters) {

            System.out.println(gameCharacter.getId()
                    + "\tKarakterimiz : " + gameCharacter.getTypeOfCharacter()
                    + "\tHasarı : " + gameCharacter.getDamage()
                    + "\tSağlığı : " + gameCharacter.getHealth()
                    + "\tParası : " + gameCharacter.getMoney());

        }

        System.out.println("-----------Seçim-----------");

        System.out.print("Karakterinizi seçiniz :");
        scanner = new Scanner(System.in);
        select = scanner.nextInt();

        switch (select) {

            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;

        }

        System.out.println("Karakterinizin ismi : " + this.getPlayerName()
                + ", Karakterinizin tipi : " + this.getTypeOfCharacter()
                + ", Hasar : " + this.getDamage()
                + ", Sağlık : " + this.getHealth()
                + ", Para :" + this.getMoney()
        );

    }
    public void playerInfo(){

        System.out.println("Silahınız : " + this.getInventory().getWeapon().getWeaponName()
                + ", Zırhınız : " + this.getInventory().getArmor().getArmorName()
                + ", Hasar : " + this.getTotalDamage()
                + ", Block : " + this.getInventory().getArmor().getBlock()
                + ", Sağlık : " + this.getHealth()
                + ", Para :" + this.getMoney()
        );

    }

    private void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setTypeOfCharacter(gameCharacter.getTypeOfCharacter());
    }

    public int getTotalDamage(){

        return this.damage + this.getInventory().getWeapon().getDamage();

    }

    public int getDamage() {

        return this.damage;

    }

    public void setDamage(int damage) {

        this.damage = damage;

    }

    public int getHealth() {

        return this.health;

    }

    public void setHealth(int health) {

        this.health = health;

    }

    public int getMoney() {

        return this.money;

    }

    public void setMoney(int money) {

        this.money = money;

    }


    public String getPlayerName() {

        return this.playerName;

    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;

    }

    public String getTypeOfCharacter() {

        return this.typeOfCharacter;

    }

    public void setTypeOfCharacter(String typeOfCharacter) {

        this.typeOfCharacter = typeOfCharacter;

    }

    public int getSelect() {

        return this.select;

    }

    public void setSelect(int select) {

        this.select = select;

    }

    public Inventory getInventory(){

        return this.inventory;

    }

    public void setInventory(Inventory inventory){

        this.inventory = inventory;

    }

    public int getOriginalHealth(){

        return this.originalHealth;

    }

    public void setOriginalHealth(int originalHealth){

        this.originalHealth = originalHealth;

    }

}
