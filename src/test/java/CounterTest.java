import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CounterTest {

    Counter counter;

    @Before
    public void beforeEachTest() throws Exception {
        counter = new Counter();
    }

    @Test
    public void shouldScoreACard() {
        assertThat(counter.getResult(Rank.TWO).getScore(), equalTo(2));
    }

    @Test
    public void shouldScoreMultipleCards(){
        assertThat(counter.getResult(Rank.TWO,Rank.THREE).getScore(), equalTo(5));
    }

    @Test
    public void shouldReturnResult() throws Exception {
        Result result = counter.getResult(Rank.TWO);
        assertThat(result.isBust(), equalTo(false));
        assertThat(result.isBlackJack(), equalTo(false));
    }

    @Test
    public void shouldReturnBlackjackResult() throws Exception {
        Result result = counter.getResult(Rank.ACE, Rank.TEN);
        assertThat(result.isBust(), equalTo(false));
        assertThat(result.isBlackJack(), equalTo(true));
    }

    @Test
    public void shouldReturnBustResult() throws Exception {
        Result result = counter.getResult(Rank.TEN, Rank.TEN, Rank.TWO);
        assertThat(result.isBust(), equalTo(true));
        assertThat(result.isBlackJack(), equalTo(false));
    }

    @Test
    public void shouldReturnAceAsOne() throws Exception {
        Result result = counter.getResult(Rank.TEN, Rank.ACE, Rank.TWO);
        assertThat(result.isBust(), equalTo(true));
        assertThat(result.isBlackJack(), equalTo(false));
        assertThat(result.getScore(), equalTo(13));
    }
}
