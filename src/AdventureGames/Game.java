package AdventureGames;

import java.util.Scanner;

public class Game {

    private Player player;
    private Scanner scanner;
    private String playerName;
    private int selectLocation;

    public void start(){

        System.out.println("Macera oyununa hoş geldiniz ");

        //System.out.print("Lütfen karakterinize bir isim veriniz :");
        scanner = new Scanner(System.in);
        //playerName = scanner.nextLine();

        player = new Player("MidNicck");
        System.out.println("Karakterinizin isimi " + player.getPlayerName());

        player.selectCharacter();

        Locations location = null;

        while (true){

            player.playerInfo();

            System.out.println();
            System.out.println("##########################################");
            System.out.println();
            System.out.println("-------- Bölgeler --------");
            System.out.println();
            System.out.println("-------- 1-Güvenli Ev --------");
            System.out.println("-------- 2-Mağaza --------");
            System.out.println();
            System.out.println("##########################################");
            System.out.println();
            System.out.print("Gitmek istediğiniz Bölgeyi seçiniz");

            selectLocation = scanner.nextInt();
            switch (selectLocation){

                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Toolstore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;

            }

            if (!location.onLocation()){

                System.out.println("GAME OVER");
                break;

            }

        }


    }

}
