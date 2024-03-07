package blackjack.model.card;

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

    public int getNumber() {
        return number;
    }
}
