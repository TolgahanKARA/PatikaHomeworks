package AdventureGames;

import java.util.Locale;

public class Forest extends BattleLocations {

    public Forest(Player player) {

        super(player, "Orman", new Vampire(), "FireWood",3);

    }

    @Override
    public boolean onLocation(){

        System.out.println(this.getName()
                + " bölgesine geldiniz karşınızda " + this.randomObstacleNumber()
                + " tane " + this.getObstacle().getObstacleName() +" var");

        String selectBattleCase = Locations.scanner.nextLine();
        selectBattleCase = selectBattleCase.toUpperCase();

        if (selectBattleCase.equals("S")){

            System.out.println("Savaşma işlemleri olacak");

        }

        return true;

    }

}
