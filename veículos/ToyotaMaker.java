public class ToyotaMaker implements IVehicleMaker {

    private static ToyotaMaker instancia;

    private ToyotaMaker() {}

    public static ToyotaMaker getInstancia() {
        if (instancia == null) {
            instancia = new ToyotaMaker();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "Corolla":
                return new ToyotaCorolla();
            case "Hilux":
                return new ToyotaHilux();
            default:
                return null;
        }
    }
}
