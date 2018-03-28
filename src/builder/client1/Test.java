package builder.client1;

//建造者模式
public class Test {
    public static void main(String[] args){
        // 兰博基尼
        IBuilder builderA = new BuilderA();
        Director directorA = new Director(builderA);
        Production p1 = directorA.construct();
        System.out.println(p1.toString());

        // 法拉利
        IBuilder builderB = new BuilderB();
        Director directorB = new Director(builderB);
        Production p2 = directorB.construct();
        System.out.println(p2.toString());
    }
}
