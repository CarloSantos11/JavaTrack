package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.generics;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer sal = new BaseballPlayer("Sal Perez");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> chiefs = new Team("Chiefs");
        Team<FootballPlayer> broncos = new Team("Broncos");
        Team<FootballPlayer> chargers = new Team("Chargers");
        Team<FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        Team<BaseballPlayer> royals = new Team("Royals");

        adelaideCrows.addPlayer(joe);
        royals.addPlayer(sal);

        System.out.println(adelaideCrows.numPlayers());

        chiefs.matchResult(adelaideCrows, 10, 2);
        chiefs.matchResult(broncos, 27, 19);
        chiefs.matchResult(chargers, 100, 3);
        adelaideCrows.matchResult(broncos, 3, 27);

        System.out.println(chiefs.ranking());
        System.out.println(adelaideCrows.ranking());
        System.out.println(broncos.ranking());
        System.out.println(chargers.ranking());

        System.out.println(chiefs.compareTo(broncos));
        System.out.println(broncos.compareTo(chiefs));

    }
}
