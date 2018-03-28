package publishSubscribe.observer1;

//观察者模式
public class Test {
    public static void main(String[] args){
        GirlClassMate MM = new GirlClassMate();     //前台MM对象
        NbaWatcher diaosi1 = new NbaWatcher("屌丝1", MM);   //看股票的同事1
        NbaWatcher diaosi2 = new NbaWatcher("屌丝2", MM);   //看股票的同事1

        //将两位屌丝同事加进前台MM的关照对象列表中
        MM.Attach(diaosi1);
        MM.Attach(diaosi2);

        //前台MM发现老板回来了
        MM.setAction("班主任回来啦！");

        //通知关照列表中的每一位同事，老板回来了
        MM.Notify();
    }
}
