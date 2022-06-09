package AdventureGames;

public class SafeHouse extends NormalLocations{

    public SafeHouse(Player player){

        super(player, "Güvenli Ev");

    }

    @Override
    public boolean onLocation(){

        System.out.println();
        System.out.println("Şu an güvenli evdesiniz");
        return true;

    }

}
