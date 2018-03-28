package factoryMethod.factoryMethod1;

//简单工厂模式
public class TestSimpleFactory {
    public static void main(String[] args){
        LeiFeng student = SimpleFactory.createLeiFeng("大学生");
        student.buyRice();;
        student.sweep();
        student.wash();
        LeiFeng volunteer = SimpleFactory.createLeiFeng("志愿者");
        volunteer.sweep();
    }
}
