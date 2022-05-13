import java.util.ArrayList;
import java.util.List;

public class Bowling {
    private List<Integer> results = new ArrayList<>();
    private final int strike = 10;
    private final int missAll = 0;

    public void rolls(List<String> rolls) {
        results.add((rolls.get(0).equals("x")) ? strike : missAll);
    }

    public int result() {
        return results.stream().mapToInt(score -> score).sum();
    }
}
