import java.util.List;

public class Bowling {
    public int rolls(List<String> rolls) {
        return (rolls.get(0).equals("x")) ? 10 : 0;
    }
}
