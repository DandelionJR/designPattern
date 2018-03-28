package publishSubscribe.observer2;

class Boss extends Notifier{

    private String action;         //通知者发现的情况

    //老板发现的情况
    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
