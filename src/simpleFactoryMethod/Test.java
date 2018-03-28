package simpleFactoryMethod;

//简单工厂模式
public class Test {
    public static void main(String[] args){
        Operation oper = OperationFactory.createOperate("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        System.out.println(oper.getResult());
    }
}
