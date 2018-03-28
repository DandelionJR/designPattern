package facade.client1;

//外观/门面模式
public class Test {
    public static void main(String[] args){
        ServiceA sa = new ServiceAImpl();
        ServiceB sb = new ServiceBImpl();
        sa.methodA();
        sb.methodB();
        System.out.println("=================");
        Facade f = new Facade();
        f.methodA();
        f.methodB();
        f.methodC();
    }
}
