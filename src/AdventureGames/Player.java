package AdventureGames;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String playerName;
    private String typeOfCharacter;
    private int select;
    private Scanner scanner;

    public Player(String playerName) {

        this.playerName = playerName;

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

        System.out.println("Karakterinizin ismi : " + this.playerName
                + " Karakterinizin tipi : " + this.typeOfCharacter
                + " Hasar : " + this.damage
                + " Sağlık : " + this.health
                + " Para :" + this.money
        );

    }

    private void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setTypeOfCharacter(gameCharacter.getTypeOfCharacter());
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

}
