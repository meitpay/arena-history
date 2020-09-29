package entity;

public class Rating {
    int matchMakingRating;
    int enemyMatchMakingRating;

    public Rating(int matchMakingRating, int enemyMatchMakingRating) {
        this.matchMakingRating = matchMakingRating;
        this.enemyMatchMakingRating = enemyMatchMakingRating;
    }

    public int getMatchMakingRating() {
        return matchMakingRating;
    }

    public void setMatchMakingRating(int matchMakingRating) {
        this.matchMakingRating = matchMakingRating;
    }

    public int getEnemyMatchMakingRating() {
        return enemyMatchMakingRating;
    }

    public void setEnemyMatchMakingRating(int enemyMatchMakingRating) {
        this.enemyMatchMakingRating = enemyMatchMakingRating;
    }
}
