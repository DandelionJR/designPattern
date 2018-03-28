package strategy.strategy_normal;

//策略模式
public class Test {
    public static void main(String[] args){
        Context context = new Context(new Add());
        System.out.println(context.exec(2, 3));
    }
}
