package AdventureGames;

import java.util.Scanner;

public abstract class Locations {

    private Player player;
    private String name;
    protected static Scanner scanner = new Scanner(System.in);

    public Locations(Player player, String name) {

        this.player = player;
        this.name = name;

    }

    public abstract boolean onLocation();

    public Player getPlayer(){

        return this.player;

    }

    public void setPlayer(Player player){

        this.player = player;

    }

    public String getName(){

        return this.name;

    }

    public void setName(String name){

        this.name = name;

    }

}
