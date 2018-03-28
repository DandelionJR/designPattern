package strategy.strategy_normal;

public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
