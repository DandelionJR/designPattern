package factoryMethod.factoryMethod1;

//工厂模式
public class TestFactory {
    public static void main(String[] args){
        LeiFengFactory factory = new StudentFactory();
        LeiFeng student = factory.createLeiFeng();
        student.sweep();
        student.buyRice();
        student.wash();
    }
}
