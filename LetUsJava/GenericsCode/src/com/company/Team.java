package com.company;

import java.util.ArrayList;

// perhaps extends makes sure that T should have inherited Player.
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;

    // If we create array of Players like below, then it will accept any kind of players for a team. But we need only one kind of player for a particular team
    // private ArrayList<Player> members;

    // So create an array like this:
    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        this.played=0;
        this.lost=0;
        this.won=0;
        this.tied=0;
        this.members= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(this.members.contains(player)){
            System.out.println(  player.getName()  +" already exist int his team !!!");
            return false;
        }else{
            members.add(player);
            System.out.println(    player.getName()+" is added to the team "+this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public int ranking(){
        return won*2+tied;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String result;
        if(ourScore>theirScore){
            won++;
            result=" win ";
        }else if(ourScore==theirScore){
            tied++;
            result= " tie ";
        }else {
            lost++;
            result= " lose ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.name + result );
            opponent.matchResult(null,theirScore,ourScore); //////// OP
        }
    }

    public int getPoints(){
        return this.won*2+this.tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if( this.getPoints() <team.getPoints() )
            return -1;
        else if( this.getPoints() > team.getPoints() )
            return 1;
        return 0;
    }
}
