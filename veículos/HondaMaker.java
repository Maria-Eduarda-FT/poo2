public class HondaMaker implements IVehicleMaker {

    private static HondaMaker instancia;

    private HondaMaker() {}

    public static HondaMaker getInstancia() {
        if (instancia == null) {
            instancia = new HondaMaker();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "Civic":
                return new HondaCivic();
            case "Fit":
                return new HondaFit();
            default:
                return null;
        }
    }
}
