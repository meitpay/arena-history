import entity.Match;
import entity.Player;
import enums.Specs;
import impl.Generator;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Generator g = new Generator();
        List<Match> matches = g.generateMatches();

        getDataVsSpecificSpec(matches, Specs.WARLOCK_DESTRUCTION);
    }

    private static void getDataVsSpecificSpec(List<Match> matches, Specs spec) {
        List<Match> filtered = matches.stream().filter(match -> {
            List<Player> players = match.getAwayTeam().getPlayers();
            return players.stream().anyMatch(player -> player.getSpecId() == spec.specId);
        }).collect(Collectors.toList());

        System.out.printf("Total games Played: %d\n", matches.size());
        double percentagesVsOpponent = ((double) filtered.size() / matches.size()) * 100;
        System.out.printf("Percentages of games vs %s %s: ", spec.specName, spec.classData.name);
        System.out.printf("%.3f\n", percentagesVsOpponent);
        getMatchWinLossData(filtered);
    }

    public static void getMatchWinLossData(List<Match> matches) {
        int totalMatches = matches.size();
        long numWins = (matches.stream().filter(Match::isVictory).count());
        long numLoss = totalMatches - numWins;
        double winPercentage = ((double) numWins / totalMatches) * 100;

        System.out.printf("Games played: %d \nTotal Wins: %d \nTotal Loss: %d \nWin Percentages: %.3f\n",
                matches.size(), numWins, numLoss, winPercentage);
    }
}

