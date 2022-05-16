import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BowlingShould {

    /* Rules
        We will not check for valid rolls.
        We will not check for correct number of rolls and frames.
        We will not provide scores for intermediate frames.
    */

    /*TODO
     * ["x"]=> 10 DONE
     * ["9","-"]=> 9
     * ["5","/"]=> 10
     * ["-","5",""]=> 5
     * ["1","/","7"]=> 17
     * ["X","X","9"]=> 29
     * */

    @Test
    public void have_strike_roll() {
        var bowling = new Bowling();

        bowling.rolls(List.of("x"));

        assertThat(bowling.result()).isEqualTo(10);
    }

    @Test
    public void have_spare_roll() {
        var bowling = new Bowling();

        bowling.rolls(List.of("9","-"));

        assertThat(bowling.result()).isEqualTo(9);
    }
}
