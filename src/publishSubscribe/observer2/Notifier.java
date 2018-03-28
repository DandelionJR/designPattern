package publishSubscribe.observer2;

import java.util.*;

//通知者，可能是班主任自己，也可能是前排女同学
abstract class Notifier {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void Attach(Observer observer) {
        observers.add(observer);
    }

    public void Delete(Observer observer) {
        observers.remove(observer);
    }

    //通知关照同学列表中每一位同事，班主任来了
    public void Notify() {
        for (Observer observer : observers) {
            observer.Update();
        }
    }

    abstract public void setAction(String action);

    abstract public String getAction();
}
