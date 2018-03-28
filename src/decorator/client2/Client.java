package decorator.client2;

/**
 * 装饰者模式
 */
public class Client {
    public static void main(String args[])
    {
        Component component,componentSB,componentBB;; //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        componentBB = new BlackBorderDecorator(componentSB);
        component.display();
        componentSB.display();
        componentBB.display();
    }
}