public class main {
    public static void main(String[] args) {
        // fábrica da Apple
        FabricanteCelular fabricanteApple = Apple.getInstancia();
        Celular iphoneX = fabricanteApple.constroiCelular("iPhone X");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();

        // fábrica da Samsung
        FabricanteCelular fabricanteSamsung = Samsung.getInstancia();
        Celular galaxy8 = fabricanteSamsung.constroiCelular("Galaxy 8");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();
    }
}
