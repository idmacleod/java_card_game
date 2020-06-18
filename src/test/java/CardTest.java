import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;

    @Before
    public void before() {
        card = new Card(SuitType.SPADES, RankType.JACK);
    }

    @Test
    public void hasSuit() {
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void canGetCardValue() {
        assertEquals(10, card.getCardValue());
    }
}
