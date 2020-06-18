import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Player player1;
    private Player player2;
    private Player player3;
    private ArrayList<Player> players;
    private Game game;

    @Before
    public void before() {
        player1 = new Player("Dave");
        player2 = new Player("Iain");
        player3 = new Player("Kirsty");
        players = new ArrayList<Player>();
        Collections.addAll(players, player1, player2, player3);
        game = new Game(players);
    }

    @Test
    public void hasDeck() {
        assertEquals(52, game.getDeck().countCards());
    }

    @Test
    public void canCountPlayers() {
        assertEquals(3, game.countPlayers());
    }

    @Test
    public void canDealCards() {
        game.dealCards(3);
        assertEquals(3, player1.countHand());
        assertEquals(3, player2.countHand());
        assertEquals(3, player3.countHand());
    }
}
