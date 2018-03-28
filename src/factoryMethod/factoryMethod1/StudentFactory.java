package factoryMethod.factoryMethod1;

public class StudentFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Student();
    }
}
