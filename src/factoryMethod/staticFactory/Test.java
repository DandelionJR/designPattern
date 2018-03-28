package factoryMethod.staticFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//静态/简单工厂模式
public class Test {
    public static void main(String[] args) throws IOException {
        Chart chart;
        InputStream in = new FileInputStream("src/factoryMethod/staticFactory/chart.properties");
        Properties prop = new Properties();
        prop.load(in);
        String key = prop.getProperty("chartType");
        chart = ChartFactory.getChart(key); //通过静态工厂方法创建产品
        chart.display();
    }
}
