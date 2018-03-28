package publishSubscribe.observer2;

//观察者模式
public class Test {
    public static void main(String[] args){
        Notifier tuhao = new Boss();     //通知者换成班主任自己了
        Observer diaosi1 = new NbaWatcher("倒霉的屌丝1", tuhao);   //看NBA的同学
        Observer diaosi2 = new ComicReader("幸运的屌丝2", tuhao);   //看NBA的同学

        //将两位屌丝同事加进前台MM的关照对象列表中
        //tuhao.Attach(diaosi1);  //倒霉的屌丝1，没有加进老板的关照列表，所以被抓住了
        tuhao.Attach(diaosi2);

        //前台MM发现老板回来了
        tuhao.setAction("班主任我回来啦！");

        //通知关照列表中的每一位同事，老板回来了
        tuhao.Notify();
    }
}
