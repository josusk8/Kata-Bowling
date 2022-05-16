import java.util.ArrayList;
import java.util.List;

public class Bowling {
    public void rolls(List<String> gameScore) {
        for (var roll : gameScore) {
            saveScore(roll);
        }
    }

    private List<Integer> finalScore = new ArrayList<>();
    private final int strike = 10;
    private final int miss = 0;

    private void saveScore(String roll) {
        switch (roll) {
            case "x" -> finalScore.add(strike);
            case "-" -> finalScore.add(miss);
            default -> finalScore.add(Integer.parseInt(roll));
        }
    }

    public int result() {
        return finalScore.stream().mapToInt(score -> score).sum();
    }
}
