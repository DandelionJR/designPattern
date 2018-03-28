package factoryMethod.factory;

//工厂模式
public class Test {
    public static void main(String[] args){
        LoggerFactory factory;
        Logger logger;
        //factory = new FileLoggerFactory(); //可引入配置文件实现
        factory = (LoggerFactory)XMLUtil.getBean(); //getBean()的返回
        logger = factory.createLogger();
        logger.writeLog();
    }
}
