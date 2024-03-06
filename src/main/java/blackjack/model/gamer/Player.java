package blackjack.model.gamer;

import blackjack.model.GameRule;

public class Player extends Gamer {

    //TODO 원시값 포장
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public boolean canHit() {
        int cardScore = deck.calculateTotalScore();
        return GameRule.playerHitRule(cardScore);
    }
}