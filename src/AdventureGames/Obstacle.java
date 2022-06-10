package AdventureGames;

import java.util.Random;

public abstract class Obstacle {

    private int id;
    private String obstacleName;
    private int obstacleDamage;
    private int obstacleHealth;
    private int maxObstacle;
    private int obstacleAward;
    private int originalObstacleHealth;


    public Obstacle(int id, String obstacleName, int obstacleDamage, int obstacleHealth, int obstacleAward) {

        this.id = id;
        this.obstacleName = obstacleName;
        this.obstacleDamage = obstacleDamage;
        this.obstacleHealth = obstacleHealth;
        this.obstacleAward = obstacleAward;
        this.originalObstacleHealth = obstacleHealth;

    }

    public int randomObstacleNumber() {

        Random random = new Random();
        maxObstacle = random.nextInt(3) + 1;
        return maxObstacle;

    }

    public int getId() {

        return this.id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getObstacleName() {

        return this.obstacleName;

    }

    public void setObstacleName(String obstacleName) {

        this.obstacleName = obstacleName;

    }

    public int getObstacleDamage() {

        return this.obstacleDamage;

    }

    public void setObstacleDamage(int obstacleDamage) {

        this.obstacleDamage = obstacleDamage;

    }

    public int getObstacleHealth() {

        return this.obstacleHealth;

    }

    public void setObstacleHealth(int obstacleHealth) {

        if (obstacleHealth < 0){

            obstacleHealth = 0;

        }

        this.obstacleHealth = obstacleHealth;

    }

    public int getObstacleAward(){

        return this.obstacleAward;

    }

    public void setObstacleAward(int obstacleAward){

        this.obstacleAward = obstacleAward;

    }

    public int getObstacleOriginalHealth(){

        return this.originalObstacleHealth;

    }

    public void setObstacleOriginalHealth(int originalObstacleHealth){

        this.originalObstacleHealth = originalObstacleHealth;

    }

}
