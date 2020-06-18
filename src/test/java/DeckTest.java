import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private ArrayList<Card> cards;


    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckIsEmptyToStart() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canPopulate() {
        deck.populate();
        assertEquals(52, deck.countCards());
    }
}