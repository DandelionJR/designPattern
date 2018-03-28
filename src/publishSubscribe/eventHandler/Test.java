package publishSubscribe.eventHandler;

//观察者模式
public class Test {
    public static void main(String[] args){
        Notifier tuhao = new Boss();
        NbaWatcher diaosi1 = new NbaWatcher("倒霉的屌丝1", tuhao);
        ComicReader diaosi2 = new ComicReader("幸运的屌丝2", tuhao);

        tuhao.setAction("班主任我回来啦！");

        try {
            tuhao.Update = diaosi1.getClass().getMethod("CloseNbaWatcher", new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        tuhao.Notify((Object)diaosi1);

        try {
            tuhao.Update = diaosi2.getClass().getMethod("CloseComicReader", new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        tuhao.Notify((Object)diaosi2);
    }
}
