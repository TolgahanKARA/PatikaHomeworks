package AdventureGames;

public abstract class NormalLocations extends Locations {

    public NormalLocations(Player player, String name) {

        super(player, name);

    }

    @Override
    public boolean onLocation() {

        return true;

    }

}
