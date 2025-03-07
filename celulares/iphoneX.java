public class iphoneX implements Celular {

    private String modelo;

    public iphoneX(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao() {
        System.out.println("Fazendo ligação com o iPhone " + modelo);
    }

    @Override
    public void tiraFoto() {
        System.out.println("Tirando foto com a câmera do iPhone " + modelo);
    }
}
