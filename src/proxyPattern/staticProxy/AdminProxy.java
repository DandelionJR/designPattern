package proxyPattern.staticProxy;

//继承式静态代理
public class AdminProxy extends Admin {
    @Override
    public void doSomething() {
        System.out.println("admin 操作开始");
        super.doSomething();
        System.out.println("admin 操作结束");
    }
}
