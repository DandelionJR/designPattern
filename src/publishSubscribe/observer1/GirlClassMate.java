package publishSubscribe.observer1;

import java.util.*;

//负责帮忙监听的女同学
class GirlClassMate {
    private String action;         //前台秘书发现的情况

    //给她送过礼的男同学们
    private ArrayList<NbaWatcher> observers = new ArrayList<NbaWatcher>();

    //增加，就是有几个同学请她帮们关照，就在集合中增加几个对象
    public void Attach(NbaWatcher observer) {
        observers.add(observer);
    }

    //从关照对象中删除对象
    public void Delete(NbaWatcher observer) {
        observers.remove(observer);
    }

    //通知关照看NBA的每一位同学，班主任来啦!
    public void Notify() {
        for (NbaWatcher observer : observers) {
            observer.Update();
        }
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}