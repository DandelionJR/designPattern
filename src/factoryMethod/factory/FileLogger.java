package factoryMethod.factory;

public class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
