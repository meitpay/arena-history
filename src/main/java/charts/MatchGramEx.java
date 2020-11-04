package charts;

import entity.Match;
import impl.Generator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchGramEx {

    public static void main(String[] args) throws IOException {

        Generator generator = new Generator();
        List<Match> matches = generator.generateMatches();
        Map<String, Integer> map = getMatchWinLossRatio(matches);

        DefaultPieDataset dataset = new DefaultPieDataset();
        map.forEach(dataset::setValue);

        JFreeChart pieChart = ChartFactory.createPieChart("Matches", dataset, true, true, false);

        pieChart.setElementHinting(false);

        ChartUtils.saveChartAsPNG(new File("matches.png"), pieChart, 1920, 1080);
    }

    private static HashMap<String, Integer> getMatchWinLossRatio(List<Match> matches) {
        HashMap<String, Integer> winLossRatio = new HashMap<>();
        int numMatches = matches.size();
        int matchesWon = Math.toIntExact((matches.stream().filter(Match::isVictory).count()));
        int matchesLost = numMatches - matchesWon;

//        winLossRatio.put("Total Matches", numMatches);
        winLossRatio.put("wins", matchesWon);
        winLossRatio.put("losses", matchesLost);

        return winLossRatio;
    }


}
