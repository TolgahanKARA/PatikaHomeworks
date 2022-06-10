package AdventureGames;

public class Cave extends BattleLocations {

    private Combat combat;

    public Cave(Player player) {

        super(player, "Mağara", new Zombie(), "Food", 3);

    }

    @Override
    public boolean onLocation() {

        int obstacleNumber = this.randomObstacleNumber();

        System.out.println(this.getName()
                + " bölgesine geldiniz karşınızda " + obstacleNumber
                + " tane " + this.getObstacle().getObstacleName() + " var");

        System.out.print("Savaş yada Kaç S/K : ");
        String selectBattleCase = Locations.scanner.nextLine().toUpperCase();

        if (selectBattleCase.equals("S") && combat(obstacleNumber)) {

            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            return true;

        }

        System.out.println("######################");
        System.out.println("Bu bölgedeki düşmanlar çok güçlü güçlenip yeniden gel");
        System.out.println("######################");

        if (this.getPlayer().getHealth() <= 0) {

            System.out.println("GAME OVER");
            return false;

        }

        return true;

    }

    public boolean combat(int obsNumber) {

        for (int i = 1; i <= obsNumber; i++) {

            this.getObstacle().setObstacleHealth(this.getObstacle().getObstacleOriginalHealth());

            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getObstacleHealth() > 0) {

                System.out.print("Vur yada Kaç V/K :");
                String choseCombat = Locations.scanner.nextLine().toUpperCase();

                if (choseCombat.equals("V")) {

                    System.out.println("Siz vurdunuz");
                    this.getObstacle().setObstacleHealth(this.getObstacle().getObstacleHealth() - this.getPlayer().getDamage());
                    afterHit();

                    if (this.getObstacle().getObstacleHealth() > 0) {

                        System.out.println("Canavar size vurdu");
                        int obstacleDamege = this.getObstacle().getObstacleDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamege);

                        afterHit();

                    }

                }

            }

            if (this.getObstacle().getObstacleHealth() < this.getPlayer().getHealth()) {

                System.out.println("----------------");

                System.out.println(i + ". Düşmanı yendiniz");
                System.out.println("################");

                System.out.println(this.getObstacle().getObstacleAward() + " para kazandınız.");
                System.out.println("################");

                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getObstacleAward());
                System.out.println("################");

                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                System.out.println("################");

            }

        }

        return true;

    }

    public void afterHit() {

        System.out.println("Canınız : " + this.getPlayer().getHealth());
        if (this.getObstacle().getObstacleHealth() > 0) {

            System.out.println(this.getObstacle().getObstacleName() + " Canı : " + this.getObstacle().getObstacleHealth());

        } else {

            System.out.println(this.getObstacle().getObstacleName() + " Canı : 0");

        }

        System.out.println("-----------------------");

    }

    public void playerStats() {

        System.out.println("Oyuncu Değerleri");
        System.out.println("----------------");
        this.getPlayer().playerInfo();

    }

    public void obstacleStats(int i) {

        System.out.println(i + ". " + this.getObstacle().getObstacleName() + " Değerleri");
        System.out.println("----------------");
        System.out.println("Sağlık : " + this.getObstacle().getObstacleHealth());
        System.out.println("Hasar : " + this.getObstacle().getObstacleDamage());
        System.out.println("Ödül : " + this.getObstacle().getObstacleAward());

    }

}
