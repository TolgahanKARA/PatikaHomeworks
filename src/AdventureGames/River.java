package AdventureGames;

public class River extends BattleLocations{

    public River(Player player){

        super(player,"Nehir",new Bear(),"Water",3);

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
