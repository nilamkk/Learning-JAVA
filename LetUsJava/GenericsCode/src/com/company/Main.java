package com.company;

import com.sun.source.tree.Scope;

import javax.print.attribute.standard.MediaSize;

public class Main {

    public static void main(String[] args) {

        SoccerPlayer Ronaldo= new SoccerPlayer("Ronaldo");
        Team<SoccerPlayer> soccerPlayerTeam= new Team("Adam");
        soccerPlayerTeam.addPlayer(Ronaldo);

        BaseBallPlayer Jonas= new BaseBallPlayer("Jonas");
        Team<BaseBallPlayer> Dark= new Team<>("Dark");
        Dark.addPlayer(Jonas);

        FootballPlayer Messi= new FootballPlayer("Messi");
        Team<FootballPlayer> footballPlayerTeam= new Team<>("NEU");

        FootballPlayer Bhutia= new FootballPlayer("Bhutia");
        Team<FootballPlayer> footballPlayerTeam1= new Team<>("CSK");

        footballPlayerTeam1.matchResult(footballPlayerTeam,9,8);
    }
}
