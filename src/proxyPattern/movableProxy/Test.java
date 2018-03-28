package proxyPattern.movableProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//动态代理模式
public class Test {
    public static void main(String[] args) throws Exception{
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();
        /**
         * loader 类加载器
         * interface 实现接口
         * h InvocationHandler
         */
        Movable m = (Movable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        m.move();
    }
}
