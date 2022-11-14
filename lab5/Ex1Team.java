package lab5;

import java.util.ArrayList;

public class Ex1Team {
    private String name;
    private ArrayList<Ex1Player> players;
    private int maxSize;
    public Ex1Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addPlayer(Ex1Player player){
        if(this.maxSize > this.players.size()) this.players.add(player);
    }

    public void printPlayers(){
        for(Ex1Player player : this.players) System.out.println(player);
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int sum = 0;
        for(Ex1Player player : players){
            sum += player.getGoals();
        }
        return sum;
    }
}
