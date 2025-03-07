public class galaxy8 implements Celular {

    private String modelo;

    public galaxy8(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao() {
        System.out.println("Fazendo ligação com o Galaxy " + modelo);
    }

    @Override
    public void tiraFoto() {
        System.out.println("Tirando foto com a câmera do Galaxy " + modelo);
    }
}
