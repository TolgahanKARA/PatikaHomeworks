package boxingGame;

public class Match {

    Fighter fighterOne;
    Fighter fighterTwo;
    int minWeight;
    int maxWeight;
    int count = 1;
    double isStartNumber;

    Match(Fighter fighterOne, Fighter fighterTwo, int minWeight, int maxWeight){

        this.fighterOne = fighterOne;
        this.fighterTwo = fighterTwo;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public void run(){

        isStartNumber = Math.random() * 100;

        if (isCheck()){

            while (this.fighterOne.health > 0 && this.fighterTwo.health > 0){

                System.out.println(count + ". ROUND");

                if (isStartNumber <= 50) {

                    if (count == 1){

                        System.out.println("Oyuna " + this.fighterOne.name + " başladı");

                    }

                    this.fighterTwo.health = this.fighterOne.hit(this.fighterTwo);
                    System.out.println(this.fighterTwo.health);
                    if (isWin()) {

                        break;

                    }

                    this.fighterOne.health = this.fighterTwo.hit(this.fighterOne);
                    System.out.println(this.fighterOne.health);
                    if (isWin()) {

                        break;

                    }

                } else if(isStartNumber >= 50) {

                    if (count == 1){

                        System.out.println("Oyuna " + this.fighterTwo.name + " başladı");

                    }

                    this.fighterOne.health = this.fighterTwo.hit(this.fighterOne);
                    System.out.println(this.fighterOne.health);
                    if (isWin()) {

                        break;

                    }

                    this.fighterTwo.health = this.fighterOne.hit(this.fighterTwo);
                    System.out.println(this.fighterTwo.health);
                    if (isWin()) {

                        break;

                    }

                }

                count++;

            }

        }else {

            System.out.println("Sporcuların sikleti uymuyor.");

        }

    }

    public boolean isCheck(){

        return ((this.fighterOne.weight >= this.minWeight && this.fighterOne.weight <= this.maxWeight)
                &&
                (this.fighterTwo.weight >= this.minWeight && this.fighterTwo.weight <= this.maxWeight));

    }

    public boolean isWin(){

        if (this.fighterOne.health == 0){

            System.out.println("Boksör " + this.fighterTwo.name + " oyunu kazanmıştır");
            return true;

        }

        if (this.fighterTwo.health == 0){

            System.out.println("Boksör " + this.fighterOne.name + " oyunu kazanmıştır");
            return true;

        }

        return false;

    }

}
