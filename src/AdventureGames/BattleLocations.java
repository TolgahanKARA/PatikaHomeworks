package AdventureGames;

import java.util.Random;

public abstract class BattleLocations extends Locations {

    Obstacle obstacle;
    private String award;
    int maxObstacle;

    public BattleLocations(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {

        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;

    }

    @Override
    public boolean onLocation() {

        return true;

    }

    public int randomObstacleNumber() {

        int obstacleNumber;

        Random random = new Random();
        obstacleNumber = random.nextInt(this.getMaxObstacle()) + 1;

        return obstacleNumber;

    }

    public Obstacle getObstacle() {

        return this.obstacle;

    }

    public void setObstacle(Obstacle obstacle) {

        this.obstacle = obstacle;

    }

    public String getAward() {

        return this.award;

    }

    public void setAward(String award) {

        this.award = award;

    }

    public int getMaxObstacle() {

        return this.maxObstacle;

    }

    public void setMaxObstacle(int maxObstacle) {

        this.maxObstacle = maxObstacle;

    }

}
