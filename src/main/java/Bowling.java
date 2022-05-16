import java.util.ArrayList;
import java.util.List;

public class Bowling {
    private List<Integer> results = new ArrayList<>();
    private final int strike = 10;
    private final int missAll = 0;

    public void rolls(List<String> rolls) {
        var score = 0;
        for (var roll : rolls) {
            if (roll.equals("x")) {
                score = strike;
            } else if (roll.equals("-")) {
                score = missAll;
            } else {
                score = Integer.parseInt(roll);
            }
            results.add(score);
        }
    }

    public int result() {
        return results.stream().mapToInt(score -> score).sum();
    }
}
