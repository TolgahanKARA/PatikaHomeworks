package AdventureGames;

public abstract class BattleLocations extends Locations {

    Obstacle obstacle;

    public BattleLocations(Player player, String name) {

        super(player, name);

    }

    @Override
    public boolean onLocation(){

        return true;

    }

}
