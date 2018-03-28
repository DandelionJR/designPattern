package publishSubscribe.observer2;

//Observer师祖
abstract class Observer {
    protected String name;          //该同学的名字
    protected Notifier notifier;        //事件通知者

    abstract void Update();

    public Observer(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }
}

