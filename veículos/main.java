public class main {
    public static void main(String[] args) {
        // instância única do fabricante Toyota
        IVehicleMaker toyotaMaker = ToyotaMaker.getInstancia();
        IVehicle toyotaCorolla = toyotaMaker.makeVehicle("Corolla");
        toyotaCorolla.start();
        toyotaCorolla.drive();
        toyotaCorolla.stop();

        System.out.println();

        IVehicleMaker hondaMaker = HondaMaker.getInstancia();
        IVehicle hondaCivic = hondaMaker.makeVehicle("Civic");
        hondaCivic.start();
        hondaCivic.drive();
        hondaCivic.stop();
    }
}