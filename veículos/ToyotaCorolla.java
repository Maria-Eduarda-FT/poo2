public class ToyotaCorolla implements IVehicle {

    @Override
    public void start() {
        System.out.println("Corolla está ligando.");
    }

    @Override
    public void drive() {
        System.out.println("Corolla está rodando.");
    }

    @Override
    public void stop() {
        System.out.println("Corolla parou.");
    }
}