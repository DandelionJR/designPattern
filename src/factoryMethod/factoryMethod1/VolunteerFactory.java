package factoryMethod.factoryMethod1;

public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
