public class Result {

    private static final int BLACKJACK = 21;
    private final int score;

    public Result(int score) {
        this.score = score;
    }

    public boolean isBust() {
        return score > BLACKJACK;
    }

    public boolean isBlackJack() {
        return score == BLACKJACK;
    }

    public int getScore() {
        return score;
    }
}
