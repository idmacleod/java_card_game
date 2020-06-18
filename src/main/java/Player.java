import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int countHand() {
        return hand.size();
    }

    public void takeCard(Card card) {
        hand.add(card);
    }

    public Card getHighestCard() {
        Card highest = hand.get(0);
        for (Card card : hand) {
            if (card.getCardValue() > highest.getCardValue()) {
                highest = card;
            }
        }
        return highest;
    }
}
