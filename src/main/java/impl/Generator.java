package impl;

import entity.Match;
import entity.Player;
import entity.Team;
import enums.Specs;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {

    public List<Match> generateMatches() {
        Reader reader = new Reader();
        String path = System.getProperty("user.dir") + "/src/main/java/data/matches.csv";
        List<Match> matches = new ArrayList<>();
        try {
            List<Map<String, String>> data = reader.getMatchData(path);
            data.forEach(element -> {
                Instant timestamp = Instant.ofEpochSecond(Long.parseLong(element.get("timestamp")));
                String homeTeam = element.get("homeTeam");
                String awayTeam = element.get("awayTeam");
                int duration = Integer.parseInt(element.get("duration"));
                boolean victory = Boolean.parseBoolean(element.get("victory"));
                int map = Integer.parseInt(element.get("mapId"));

                matches.add(
                        new Match(
                                timestamp,
                                generateTeam(homeTeam, Integer.parseInt(element.get("homeTeamMMR"))),
                                generateTeam(awayTeam, Integer.parseInt(element.get("awayTeamMMR"))),
                                duration,
                                victory,
                                Integer.parseInt(element.get("ratingChange")),
                                map));

            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return matches;
    }

    private Team generateTeam(String playerString, int mmr) {

        List<String> split = Stream.
                of(playerString.toUpperCase().replace("-", "_").split("[,]"))
                .map(String::trim)
                .collect(Collectors.toList());

        Specs playerOne = Specs.valueOf(split.get(0));
        Specs playerTwo = Specs.valueOf(split.get(1));
        Specs playerThree = Specs.valueOf(split.get(2));

        List<Player> players = new ArrayList<>();
        players.add(new Player(playerOne.classData.id, playerOne.specId, playerOne.classData.name, playerOne.specName));
        players.add(new Player(playerTwo.classData.id, playerTwo.specId, playerTwo.classData.name, playerTwo.specName));
        players.add(new Player(playerThree.classData.id, playerThree.specId, playerThree.classData.name, playerThree.specName));

        return new Team(players, mmr);
    }
}
