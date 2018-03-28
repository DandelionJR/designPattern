package factoryMethod.factoryMethod1;

public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type){
        LeiFeng result = null;
        switch (type){
            case "大学生":
                result = new Student();
                break;
            case "志愿者":
                result = new Volunteer();
                break;
        }
        return result;
    }
}
