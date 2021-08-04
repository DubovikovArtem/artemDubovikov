package lesson11;

public class CreateDeck {
    private int deckLength = 52;
    private String[] deck = new String[deckLength];

    public int getDeckLength() {
        return deckLength;
    }

    public String[] createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dama", "King", "Tuz"};
        String[] suits = {"Pica", "Chirva", "Buba", "Krest"};
        int count = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[count++] = String.format("%s of %s", suit, rank);
            }
        }
        return deck;
    }
}
