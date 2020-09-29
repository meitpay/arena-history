package entity;

public class Team {
    Player p1, p2, p3;
    int mmr;

    public Team(Player p1, Player p2, Player p3, int mmr) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mmr = mmr;
    }
}
