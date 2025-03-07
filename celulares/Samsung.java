public class Samsung implements FabricanteCelular {

    private static Samsung instancia;

    private Samsung() {}

    public static Samsung getInstancia() {
        if (instancia == null) {
            instancia = new Samsung();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        return new galaxy8(modelo);
    }
}
