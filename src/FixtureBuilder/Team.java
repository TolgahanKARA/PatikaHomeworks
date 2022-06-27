package FixtureBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Team {

    List<String> teamList = new LinkedList<>();

    public void ligFixturePrint() {

        if (teamList.size() % 2 != 0) {

            teamList.add("Bay");

        }

        if (teamList.size() != 0) {

            System.out.println("Teams\n");

            for (String caunt : teamList) {

                System.out.println("-" + caunt);

            }

        } else {

            System.out.println("There are no teams in the league");

        }

        System.out.println();
        round();

    }

    private void round() {

        List<String> teamListWeek = new LinkedList<>();

        int rount = 2 * (teamList.size() - 1);

        List<String> teamListBacup = new LinkedList<>(teamList);

        int value = (teamList.size() / 2);

        for (int i = 1; i < (rount / 2 + 1); i++) {

            for (int j = 1; j <= (value + 2); j += 2) {

                teamListWeek.add(teamListBacup.get(j) + " " + teamListBacup.get(j + 1));

            }

            teamListBacup.add(1, teamListBacup.get(value));
            teamListBacup.add(value, teamListBacup.get(teamListBacup.size() - 1));
            teamListBacup.remove(teamListBacup.size() - 1);
            teamListBacup.remove(teamListBacup.size() - 2);

        }

        for (int i = (rount / 2 + 2); i <= rount + 1; i++) {

            for (int j = 0; j <= (value + 2); j += 2) {

                teamListWeek.add(teamListBacup.get(j + 1) + " " + teamListBacup.get(j));

            }

            teamListBacup.add(1, teamListBacup.get(value));
            teamListBacup.add(value, teamListBacup.get(teamListBacup.size() - 1));
            teamListBacup.remove(teamListBacup.size() - 1);
            teamListBacup.remove(teamListBacup.size() - 2);

        }

        int count = 0;
        int num;

        for (int i = 1; i <= rount; i++) {

            System.out.println("-------------\nRount" + i);

            List<String> bacup = new LinkedList<>();

            for (int j = count; j < (count + value); j++){

                bacup.add(teamListWeek.get(j));

            }

            for (int j=0;j<value;j++){

                num = new Random().nextInt(bacup.size());
                System.out.println(bacup.get(num));
                bacup.remove(num);

            }

            count += value;

        }

    }

}
