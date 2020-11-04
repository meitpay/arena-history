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

    public Instant getTimestamp() {
        return timestamp;
    }

    public int getMap() {
        return map;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getDuration() {
        return duration;
    }

    public int getRatingChange() {
        return ratingChange;
    }

    public boolean isVictory() {
        return victory;
    }
}
