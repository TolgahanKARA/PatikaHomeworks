package AdventureGames;

import java.util.Scanner;

public class Game {

    private Player player;
    private Scanner scanner;
    private String playerName;

    public void start(){

        System.out.println("Macera oyununa hoş geldiniz ");

        //System.out.print("Lütfen karakterinize bir isim veriniz :");
        //scanner = new Scanner(System.in);
        //playerName = scanner.nextLine();

        player = new Player("MidNicck");
        System.out.println("Karakterinizin isimi " + player.getPlayerName());

        player.selectCharacter();

    }

}
