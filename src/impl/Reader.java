package impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Reader {

    public List<Map<String, String>> getMatchData(String path) throws IOException {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return toMap(records);
    }

    private List<Map<String, String>> toMap(List<List<String>> records) {
        List<Map<String, String>> mappedRecords = new ArrayList<>();

        records.forEach(element -> {
            Map<String, String> data = new HashMap<>();
            data.put("timestamp", element.get(0));
            data.put("mapId", element.get(1));
            data.put("numPlayers", element.get(2));
            data.put("homeTeam", element.get(3));
            data.put("awayTeam", element.get(4));
            data.put("duration", element.get(5));
            data.put("victory", element.get(6));
            data.put("killingBlows", element.get(7));
            data.put("damageDone", element.get(8));
            data.put("healingDone", element.get(9));
            data.put("honor", element.get(10));
            data.put("ratingChange", element.get(11));
            data.put("homeTeamMMR", element.get(12));
            data.put("awayTeamMMR", element.get(13));
            data.put("specialization", element.get(14));
            data.put("isRated", element.get(15));
            mappedRecords.add(data);
        });

        return mappedRecords;
    }
}
