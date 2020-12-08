package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.generics;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer sal = new BaseballPlayer("Sal Perez");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        League<Team<FootballPlayer>> afc = new League<>("AFC");
        Team<FootballPlayer> chiefs = new Team("Chiefs");
        Team<FootballPlayer> broncos = new Team("Broncos");
        Team<FootballPlayer> chargers = new Team("Chargers");
        Team<FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        Team<BaseballPlayer> royals = new Team("Royals");


        afc.add(chiefs);
        afc.add(broncos);
        afc.add(chargers);
        afc.add(adelaideCrows);

        chiefs.matchResult(adelaideCrows, 10, 2);
        chiefs.matchResult(broncos, 27, 19);
        chiefs.matchResult(chargers, 100, 3);
        adelaideCrows.matchResult(broncos, 3, 27);
        adelaideCrows.matchResult(broncos, 30, 27);
        adelaideCrows.matchResult(chargers, 30, 27);

        afc.showLeagueTable();
//
//        adelaideCrows.addPlayer(joe);
//        royals.addPlayer(sal);
//
//        System.out.println(adelaideCrows.numPlayers());
//
//
//        System.out.println(chiefs.ranking());
//        System.out.println(adelaideCrows.ranking());
//        System.out.println(broncos.ranking());
//        System.out.println(chargers.ranking());
//
//        System.out.println(chiefs.compareTo(broncos));
//        System.out.println(broncos.compareTo(chiefs));

    }
}
