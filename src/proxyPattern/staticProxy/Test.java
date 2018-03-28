package proxyPattern.staticProxy;

//静态代理模式
public class Test {
    public static void main(String[] args){
        Admin admin = new Admin();
        Manager m = new AdminPoly(admin);
        m.doSomething();



        AdminProxy proxy = new AdminProxy();
        proxy.doSomething();
    }
}
