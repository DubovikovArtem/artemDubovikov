package lesson11;

import lesson11.exception.CountOfPlayersException;

public class Main {
    public static void main(String[] args) {
        int countOfPlayers = 4;
        if (countOfPlayers < 2 || countOfPlayers > 10) {
            throw new CountOfPlayersException("Введите корректное кол-во игроков");
        } else {
            ServeDeck serveDeck = new ServeDeck();
            serveDeck.serveDeck(countOfPlayers);
        }
    }
}
