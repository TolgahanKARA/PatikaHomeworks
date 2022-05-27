package boxingGame;

public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("a", 10,100,100,100);
        Fighter f2 = new Fighter("b", 10,100,85,0);

        Match match = new Match(f1,f2,85,100);
        match.run();

    }

}
