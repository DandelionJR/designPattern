package strategy.strategy_normal;

public class Context {
    private Calculator cal = null;
    public Context(Calculator cal){
        this.cal = cal;
    }
    public int exec(int a, int b){
        return this.cal.exec(a, b);
    }
}
