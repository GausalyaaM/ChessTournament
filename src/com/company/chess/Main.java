package com.company.chess;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int numOfPlayers=scan.nextInt();
        List<Player> list=PlayerCreation.createPlayer(numOfPlayers);
        System.out.println("Enter the number of rounds:");
        int numOfRounds=scan.nextInt();
        System.out.println(list);
        List<Match> list1=PlayerCreation.scheduleMatch(list);
        System.out.println(list1);

    }
}
