package com.company.chess;

public class Player {
    static private int playerCount=0;
    private String name;
    private int numOfMatch;
    private int win;
    private int lose;
    private int draw;
    private long point;
    private int currentRating;
    private int playerId;

    public Player(String name){
        playerCount+=1;
        playerId=playerCount;
        this.name=name;
        this.numOfMatch=0;
        this.win=0;
        this.lose=0;
        this.draw=0;
        this.point=0;
        this.currentRating=0;
    }

   /* public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }*/

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfMatch() {
        return numOfMatch;
    }
    public void setNumOfMatch(int numOfMatch) {
        this.numOfMatch = numOfMatch;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }
    public long getPoint() {
        return point;
    }
    public void setPoint(long point) {
        this.point = point;
    }
    public int getCurrentRating() {
        return currentRating;
    }
    public void setCurrentRating(int currentRating) {
        this.currentRating = currentRating;
    }
    public String toString(){
        return this.name+" "+playerId;
    }
}
