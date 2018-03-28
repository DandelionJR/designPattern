package publishSubscribe.observer1;

//看NBA的同学
class NbaWatcher {
    private String name;          //该同学的名字
    private GirlClassMate wodi;   //前排卧底MM
    public void Update() {
        // TODO Auto-generated method stub
        System.out.println(wodi.getAction() + name + "别看球赛啦，继续学习！");
    }
    public NbaWatcher(String name, GirlClassMate wodi) {
        this.name = name;
        this.wodi = wodi;
    }
}