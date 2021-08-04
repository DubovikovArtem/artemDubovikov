package lesson11;

import java.util.Random;

public class ShuffleDeck extends CreateDeck {
    private String[] deck = createDeck();

    public String[] shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < getDeckLength(); i++) {
            int in = random.nextInt(getDeckLength());
            int out = random.nextInt(getDeckLength());
            String card = deck[in];
            deck[in] = deck[out];
            deck[out] = card;
        }
        return deck;
    }
}
