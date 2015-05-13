
public class Counter {

    private int score(Rank... ranks) {
        int result = 0;

        for (Rank rank : ranks) {
            result+=rank.getValue();
        }
        return result;
    }

    public Result getResult(Rank... ranks) {
        return new Result(score(ranks));
    }
}
