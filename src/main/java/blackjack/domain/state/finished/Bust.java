package blackjack.domain.state.finished;

import static blackjack.domain.game.GameOutcome.DRAW;
import static blackjack.domain.game.GameOutcome.LOSE;

import blackjack.domain.card.Cards;
import blackjack.domain.game.GameOutcome;
import blackjack.domain.game.betting.BettingMoney;
import blackjack.domain.state.State;

public class Bust extends Finished {

    public Bust(final Cards cards, final BettingMoney bettingMoney) {
        super(cards, bettingMoney);
    }

    @Override
    GameOutcome compare(final State another) {
        if (another.isSameStateWith(Bust.class)) {
            return DRAW;
        }
        return LOSE;
    }
}
