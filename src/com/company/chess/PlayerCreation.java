package com.company.chess;

import java.util.ArrayList;
import java.util.List;

public class PlayerCreation {
    public static List<Player> createPlayer(int number){
        List<Player> list=new ArrayList<>();
        for(int i=1;i<=number;i++){
            Player p=new Player("Player"+i);
            list.add(p);
        }
        return list;
    }
    public static List<Match> scheduleMatch(List<Player> list){
        List<Match> matchList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j< list.size();j++){
                Match match=new Match();
                match.setPlayer(list.get(i));
                match.setOpponent(list.get(j));
                matchList.add(match);
            }
        }
        return matchList;
    }
}
