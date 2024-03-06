package blackjack.model.card;

import java.util.Arrays;
import java.util.List;

public enum CardNumber {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    KING(10),
    QUEEN(10),
    JACK(10),
    ACE(11);

    private final int number;

    CardNumber(int number) {
        this.number = number;
    }

    public static List<CardNumber> getCardNumber() {
        return Arrays.asList(values());
    }

    public int getNumber() {
        return number;
    }
}