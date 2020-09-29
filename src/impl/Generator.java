package impl;

import entity.Match;
import entity.Player;
import entity.Team;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {

    public List<Match> generateMatch() {
        Reader reader = new Reader();
        String path = System.getProperty("user.dir") + "/src/data/matches.csv";
        List<Match> matches = new ArrayList<>();
        try {
            List<Map<String, String>> data = reader.getMatchData(path);
            data.forEach(element -> {
                System.out.println(element.keySet());
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

        System.out.println(matches);
        return matches;
    }

    private Team generateTeam(String playerString, int mmr) {
        List<String> split = Stream.of(playerString.split("[,-]")).map(String::trim).collect(Collectors.toList());

        List<Player> players = new ArrayList<>();
        players.add(new Player(split.get(0), split.get(1)));
        players.add(new Player(split.get(2), split.get(3)));
        players.add(new Player(split.get(4), split.get(5)));

        return new Team(players.get(0), players.get(1), players.get(2), mmr);
    }
}
