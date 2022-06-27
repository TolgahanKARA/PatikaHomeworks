package FixtureBuilder;

public class Main {

    public static void main(String[] args) {

        Team teams = new Team();

        teams.teamList.add("Beşiktaş");
        teams.teamList.add("Galatasaray");
        teams.teamList.add("Fenerbahçe");
        teams.teamList.add("Bursaspor");
        teams.teamList.add("Hartayspor");
        teams.teamList.add("Trabzonspor");
        teams.teamList.add("Boluspor");

        teams.ligFixturePrint();

    }

}
