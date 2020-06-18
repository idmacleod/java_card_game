import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int countCards() {
        return cards.size();
    }

    public void populate() {
        for (SuitType suit : SuitType.values()) {
            for(RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        return cards.remove(0);
    }
}
