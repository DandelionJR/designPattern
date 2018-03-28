package publishSubscribe.observer2;

//看NBA的的同事
class NbaWatcher extends Observer{

    public NbaWatcher(String name, Notifier notifier) {
        super(name, notifier);
        // TODO Auto-generated constructor stub
    }

    public void Update() {
        // TODO Auto-generated method stub
        System.out.println(notifier.getAction() + name + "别看球赛啦，继续学习！");
    }
}
