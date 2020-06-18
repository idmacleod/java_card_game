import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {
    private Deck deck1;
    private Deck deck2;
    private ArrayList<Card> cards;


    @Before
    public void before() {
        deck1 = new Deck();
        deck2 = new Deck();
    }

    @Test
    public void deckIsEmptyToStart() {
        assertEquals(0, deck1.countCards());
    }

    @Test
    public void canPopulate() {
        deck1.populate();
        assertEquals(52, deck1.countCards());
    }

    @Test
    public void canShuffle() {
        deck1.populate();
        deck2.populate();
        deck2.shuffleCards();
        ArrayList<Card> freshPack = deck1.getCards();
        ArrayList<Card> shuffledPack = deck2.getCards();
        assertNotSame(freshPack, shuffledPack);
    }

    @Test
    public void canDealCard() {
        deck1.populate();
        Card cardDealt = deck1.dealCard();
        assertEquals(51, deck1.countCards());
        assertEquals(SuitType.HEARTS, cardDealt.getSuit());
        assertEquals(RankType.ACE, cardDealt.getRank());
    }
}