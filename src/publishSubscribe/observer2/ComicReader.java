package publishSubscribe.observer2;

//看世界杯的同事
class ComicReader extends Observer{

    public ComicReader(String name, Notifier notifier) {
        super(name, notifier);
        // TODO Auto-generated constructor stub
    }

    public void Update() {
        // TODO Auto-generated method stub
        System.out.println(notifier.getAction() + name + "别看漫画啦，继续学习");
    }
}
