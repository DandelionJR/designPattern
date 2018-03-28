package simpleFactoryMethod;

public class OperationAdd extends Operation {
    @Override
    public double getResult(){
        return getNumberA() + getNumberB();
    }
}
