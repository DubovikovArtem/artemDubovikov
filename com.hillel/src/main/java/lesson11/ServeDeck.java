package lesson11;

public class ServeDeck extends ShuffleDeck {
    private String[] deck = shuffleDeck();

    public void serveDeck(int countOfPlayers) {
        int count = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Round - " + i);
            for (int j = 1; j < countOfPlayers + 1; j++) {
                String card = deck[count++];
                System.out.printf("Player %d get card %s%n", j, card);
            }
        }
    }
}
