package entity;

import java.util.List;

public class Team {
    List<Player> players;
    int mmr;

    public Team(List<Player> players, int mmr) {
        this.players = players;
        this.mmr = mmr;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getMmr() {
        return mmr;
    }
}
