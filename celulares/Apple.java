public class Apple implements FabricanteCelular {

    private static Apple instancia;

    private Apple() {}

    public static Apple getInstancia() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        return new iphoneX(modelo);
    }
}
