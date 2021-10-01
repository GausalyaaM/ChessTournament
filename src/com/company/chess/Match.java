package com.company.chess;

public class Match {
    private Player player;
    private Player opponent;
    private String location;
    private Player winner;
    private Player loser;
    private int probability_rate=10;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public int getProbability_rate() {
        return probability_rate;
    }

    public void setProbability_rate(int probability_rate) {
        this.probability_rate = probability_rate;
    }
    public String toString(){
        return this.player+" "+this.opponent;
    }
}
