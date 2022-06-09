package AdventureGames;

public class Cave extends BattleLocations {

    public Cave(Player player) {

        super(player, "Mağara", new Zombie(), "Food", 3);

    }

    @Override
    public boolean onLocation() {

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
