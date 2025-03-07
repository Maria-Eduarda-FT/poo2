public class HondaCivic implements IVehicle {

    @Override
    public void start() {
        System.out.println("Civic está ligando.");
    }

    @Override
    public void drive() {
        System.out.println("Civic está rodando.");
    }

    @Override
    public void stop() {
        System.out.println("Civic parou.");
    }
}