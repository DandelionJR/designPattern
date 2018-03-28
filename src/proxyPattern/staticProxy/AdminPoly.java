package proxyPattern.staticProxy;

//以聚合的方式实现代理
public class AdminPoly implements  Manager {
    private Admin admin;
    public AdminPoly(Admin admin){
        super();
        this.admin = admin;
    }

    @Override
    public void doSomething() {
        System.out.println("admin 操作开始");
        admin.doSomething();
        System.out.println("admin 操作结束");
    }
}
