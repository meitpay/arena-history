package entity;

import java.time.Instant;

public class Match {
    Instant timestamp;
    int map;
    Team homeTeam;
    Team awayTeam;
    int duration;
    int ratingChange;
    boolean victory;

    public Match(Instant timestamp, Team homeTeam, Team awayTeam, int duration, boolean victory, int ratingChange, int map) {
        this.timestamp = timestamp;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.duration = duration;
        this.victory = victory;
        this.ratingChange = ratingChange;
        this.map = map;
    }
}
