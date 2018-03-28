package publishSubscribe.observer2;

class GirlClassMate extends Notifier{
    private String action;         //通知者发现的情况

    //前台MM发现的情况
    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
